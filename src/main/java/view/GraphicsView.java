package view;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import type.Message;
import utils.Console;

public class GraphicsView implements View {

    @Override
    public void visit(StartController startController) {
        System.out.println("Graphics");
        startController.start();
        Console.getInstance().writeln(Message.GREETING.value());
    }

    @Override
    public void visit(PlayController playController) {
        Console.getInstance().writeln(Message.N_ATTEMPTS.value(), playController.getNumberAttempts());
    }

    @Override
    public void visit(ResumeController resumeController) {
        Console.getInstance().writeln("bye");
    }
}
