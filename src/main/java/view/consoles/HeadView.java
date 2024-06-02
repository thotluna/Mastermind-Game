package view.consoles;

import models.Attempt;
import models.Game;
import type.Message;

public class HeadView extends ViewShow {
    private final Game game;
    public HeadView(Game game) {
        this.game = game;
    }

    @Override
    public void interact() {

        console.writeln(Message.N_ATTEMPTS.value(), game.getNumberAttempts());
        console.writeln(game.getSecretString());

        for (Attempt attempt : game.getAttempts()) {
            console.writeln(attempt.toString());
        }
    }
}
