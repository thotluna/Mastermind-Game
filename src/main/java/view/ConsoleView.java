package view;

import models.Game;
import type.Message;
import utils.YesNotQuestion;

public class ConsoleView extends View {
    private final GreetingView greetingView;
    private final YesNotQuestion yesNotQuestionView;
    private final GameView gameView;
    private final GoodbyeView goodbyeView;


    public ConsoleView() {
        super();
        Game game = new Game();
        greetingView = new GreetingView();
        yesNotQuestionView = new YesNotQuestion();
        goodbyeView = new GoodbyeView();
        gameView = new GameView(game);
    }

    @Override
    public void interact() {
        do {
            greetingView.interact();
            gameView.interact();
        }while(yesNotQuestionView.read(Message.RESUME.value()).isAffirmative());
        goodbyeView.interact();
    }

}
