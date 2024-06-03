package view;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import type.Message;
import utils.Console;

public class GraphicsView implements View {

    @Override
    public void start(StartController controller) {
        System.out.println("Graphics");
        controller.start();
        Console.getInstance().writeln(Message.GREETING.value());
    }

    @Override
    public void play(PlayController controller) {
        Console.getInstance().writeln(Message.N_ATTEMPTS.value(), controller.getNumberAttempts());
    }

    @Override
    public void resume(ResumeController controller) {
        Console.getInstance().writeln("bye");
    }
}
