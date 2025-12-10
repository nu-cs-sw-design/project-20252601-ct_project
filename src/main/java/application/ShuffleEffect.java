package application;

import domain.game.Game;

public class ShuffleEffect extends AbstractCardEffect {

    public ShuffleEffect() {
    }

    @Override
    protected void validate(Game game, CardPlayContext context) {
        if (game == null || context == null) {
            throw new IllegalArgumentException("Game and context must not be null");
        }
    }

    @Override
    protected void doApply(Game game, CardPlayContext context) {
        Integer count = context.getTargetPlayerIndex();
        int numberOfShuffles = (count == null || count <= 0) ? 1 : count;
        game.playShuffle(numberOfShuffles);
    }
}