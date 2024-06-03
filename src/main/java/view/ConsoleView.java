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

    private final StartController startController;

    public ConsoleView(StartController startController, PlayController playController, ResumeController resumeController) {
        greetingView = new GreetingView();
        this.startController = startController;
        gameView = new GameView(playController);
        resumeView = new ResumeView(resumeController);
    }

    @Override
    public void start() {
        startController.start();
        greetingView.interact();
    }

    @Override
    public void play() {
        gameView.interact();
    }

    @Override
    public boolean resume() {
        return resumeView.interact() ;
    }
}
