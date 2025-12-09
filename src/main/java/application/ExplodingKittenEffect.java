package application;

import domain.game.CardType;
import domain.game.Game;

public class ExplodingKittenEffect extends AbstractCardEffect {

    public ExplodingKittenEffect() {
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
        game.playExplodingKitten(playerIndex);
    }
}