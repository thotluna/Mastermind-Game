package view;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import view.consoles.GameView;
import view.consoles.GreetingView;
import view.consoles.ResumeView;

public class ConsoleView implements View {
    private final GreetingView greetingView;
    private final GameView gameView;
    private final ResumeView resumeView;

    public ConsoleView() {
        greetingView = new GreetingView();
        gameView = new GameView();
        resumeView = new ResumeView();
    }

    @Override
    public void visit(StartController startController) {
        greetingView.interact();
        startController.start();
    }

    @Override
    public void visit(PlayController playController) {
        gameView.interact(playController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeView.interact(resumeController);
    }
}
