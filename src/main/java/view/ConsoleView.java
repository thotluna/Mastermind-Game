package view;

import models.Game;
import type.Message;
import utils.YesNotQuestion;

public class ConsoleView extends View {
    private final GreetingView greetingView;
    private final YesNotQuestion yesNotQuestionView;
    private GameView gameView;
    private final GoodbyeView goodbyeView;


    public ConsoleView() {
        super();

        greetingView = new GreetingView();
        yesNotQuestionView = new YesNotQuestion();
        goodbyeView = new GoodbyeView();

    }

    private void initGame(){
        Game game = new Game();
        gameView = new GameView(game);
    }

    @Override
    public void interact() {
        do {
            initGame();
            greetingView.interact();
            gameView.interact();
        }while(yesNotQuestionView.read(Message.RESUME.value()).isAffirmative());
        goodbyeView.interact();
    }

}
