package application;

import domain.game.Game;

public class NullEffect implements CardEffect {

    public NullEffect() {
    }

    @Override
    public void apply(Game game, CardPlayContext context) {
    }
}