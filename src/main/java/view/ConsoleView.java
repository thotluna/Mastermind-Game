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
    public void start(StartController controller) {
        greetingView.interact();
        controller.start();
    }

    @Override
    public void play(PlayController controller) {
        gameView.interact(controller);
    }

    @Override
    public void resume(ResumeController controller) {
        resumeView.interact(controller);
    }
}
