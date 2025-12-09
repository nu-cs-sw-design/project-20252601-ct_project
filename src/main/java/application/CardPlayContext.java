package application;

import domain.game.Card;

public class CardPlayContext {
    private final int currentPlayerIndex;
    private Integer targetPlayerIndex;
    private final Card card;
    private boolean cancelled;
    private Integer turnsRemaining;

    public CardPlayContext(int currentPlayerIndex, Card card) {
        this.currentPlayerIndex = currentPlayerIndex;
        this.card = card;
        this.targetPlayerIndex = null;
        this.cancelled = false;
        this.turnsRemaining = null;
    }

    public void setTargetPlayerIndex(int targetPlayerIndex) {
        this.targetPlayerIndex = targetPlayerIndex;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public Integer getTargetPlayerIndex() {
        return targetPlayerIndex;
    }

    public Card getCard() {
        return card;
    }

    public void cancel() {
        this.cancelled = true;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setTurnsRemaining(int turnsRemaining) {
        this.turnsRemaining = turnsRemaining;
    }

    public Integer getTurnsRemaining() {
        return turnsRemaining;
    }
}