package view;

import controllers.Logic;
import view.consoles.GameView;
import view.consoles.GreetingView;
import view.consoles.ResumeView;

public class ConsoleView implements View {
    private final GreetingView greetingView;
    private final GameView gameView;
    private final ResumeView resumeView;
    private final Logic logic;


    public ConsoleView(Logic logic) {
        this.logic = logic;
        greetingView = new GreetingView();
        gameView = new GameView(logic);
        resumeView = new ResumeView(logic);
    }

    @Override
    public void start() {
        logic.start();
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
