package application;

import domain.game.Game;

public interface CardEffect {
    void apply(Game game, CardPlayContext context);
}