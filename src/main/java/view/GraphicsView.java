package view;

import controllers.PlayController;
import controllers.StartController;
import type.Message;
import utils.Console;

public class GraphicsView implements View {

    private final StartController startController;
    private final  PlayController playController;

    public GraphicsView(StartController startController, PlayController playController) {

        this.startController = startController;
        this.playController = playController;
    }

    @Override
    public void start() {
        System.out.println("Graphics");
        startController.start();
        Console.getInstance().writeln(Message.GREETING.value());
        Console.getInstance().writeln(Message.N_ATTEMPTS.value(), playController.getNumberAttempts());
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
