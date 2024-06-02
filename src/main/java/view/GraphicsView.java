package view;

import models.Game;
import type.Message;
import utils.Console;

public class GraphicsView {

    private final Game game;

    public GraphicsView() {
        this.game = new Game();
    }

    public void interact() {
        System.out.println("Graphics");
        Console.getInstance().writeln(Message.GREETING.value());
        Console.getInstance().writeln(Message.N_ATTEMPTS.value(), game.getNumberAttempts());

    }
}
