package application;

import domain.game.Game;

public class CardPlayService {
    private final Game game;
    private final CardEffectFactory effectFactory;

    public CardPlayService(Game game, CardEffectFactory effectFactory) {
        this.game = game;
        this.effectFactory = effectFactory;
    }

    public void playCard(CardPlayContext context) {
        if (context == null || context.isCancelled()) {
            return;
        }
        CardEffect effect = effectFactory.createEffect(context.getCard().getCardType());
        effect.apply(game, context);
    }
}