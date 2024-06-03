package view;

import controllers.Logic;
import type.Message;
import utils.Console;

public class GraphicsView implements View {

    private final Logic logic;
    public GraphicsView(Logic logic) {
        this.logic = logic;
    }

    @Override
    public void start() {
        System.out.println("Graphics");
        logic.start();
        Console.getInstance().writeln(Message.GREETING.value());
        Console.getInstance().writeln(Message.N_ATTEMPTS.value(), logic.getNumberAttempts());
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
