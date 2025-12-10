package application;

import domain.game.CardType;
import domain.game.Game;

public class SkipEffect extends AbstractCardEffect {

    public SkipEffect() {
    }

    @Override
    protected void validate(Game game, CardPlayContext context) {
        if (game == null || context == null) {
            throw new IllegalArgumentException("Game and context must not be null");
        }
    }

    @Override
    protected void doApply(Game game, CardPlayContext context) {
        CardType type = context.getCard().getCardType();
        boolean superSkip = type == CardType.SUPER_SKIP;
        int turnsLeft = game.playSkip(superSkip);
        context.setTurnsRemaining(turnsLeft);
    }
}