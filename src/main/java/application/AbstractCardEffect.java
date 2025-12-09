package application;

import domain.game.Game;

public abstract class AbstractCardEffect implements CardEffect {
    @Override
    public final void apply(Game game, CardPlayContext context) {
        validate(game, context);
        doApply(game, context);
    }

    protected void validate(Game game, CardPlayContext context) {
    }

    protected abstract void doApply(Game game, CardPlayContext context);
}