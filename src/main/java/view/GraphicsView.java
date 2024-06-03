package view;

import models.Game;
import type.Message;
import utils.Console;

public class GraphicsView implements View {

    private final Game game;

    public GraphicsView(Game game) {
        this.game = game;
    }

    @Override
    public void start() {
        System.out.println("Graphics");
        Console.getInstance().writeln(Message.GREETING.value());
        Console.getInstance().writeln(Message.N_ATTEMPTS.value(), game.getNumberAttempts());
    }

    @Override
    public void play() {
        Console.getInstance().writeln("Play");
    }

    @Override
    public boolean resume() {
        return true;
    }
}
