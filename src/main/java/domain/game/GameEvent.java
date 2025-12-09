package domain.game;

public class GameEvent {
    private final GameEventType type;
    private final int actorPlayerIndex;
    private final CardType cardType;

    public GameEvent(GameEventType type, int actorPlayerIndex, CardType cardType) {
        this.type = type;
        this.actorPlayerIndex = actorPlayerIndex;
        this.cardType = cardType;
    }

    public GameEventType getType() {
        return type;
    }

    public int getActorPlayerIndex() {
        return actorPlayerIndex;
    }

    public CardType getCardType() {
        return cardType;
    }
}