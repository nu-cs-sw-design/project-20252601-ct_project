package domain.game;

public interface GameObserver {
    void onCardPlayed(GameEvent event);
    void onGameOver(GameEvent event);
}
