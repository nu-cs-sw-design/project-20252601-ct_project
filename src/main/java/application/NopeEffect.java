package application;

import domain.game.Game;

public class NopeEffect extends AbstractCardEffect {

    public NopeEffect() {
    }

    @Override
    protected void validate(Game game, CardPlayContext context) {
        if (game == null || context == null) {
            throw new IllegalArgumentException("Game and context must not be null");
        }
    }

    @Override
    protected void doApply(Game game, CardPlayContext context) {
        int playerIndex = context.getCurrentPlayerIndex();
        game.playNope(playerIndex);
        context.cancel();
    }
}