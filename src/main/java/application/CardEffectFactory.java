package application;

import domain.game.CardType;

public class CardEffectFactory {

    public CardEffectFactory() {
    }

    public CardEffect createEffect(CardType cardType) {
        if (cardType == null) {
            return new NullEffect();
        }
        switch (cardType) {
            case EXPLODING_KITTEN:
                return new ExplodingKittenEffect();
            case NOPE:
                return new NopeEffect();
            case SHUFFLE:
                return new ShuffleEffect();
            case SKIP:
            case SUPER_SKIP:
                return new SkipEffect();
            default:
                return new NullEffect();
        }
    }
}