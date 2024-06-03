package view;

import models.Game;
import type.Message;
import utils.YesNotQuestion;
import view.consoles.GameView;
import view.consoles.GoodbyeView;
import view.consoles.GreetingView;

public class ConsoleView implements View {
    private final GreetingView greetingView;
    private final YesNotQuestion yesNotQuestionView;
    private final GameView gameView;
    private final GoodbyeView goodbyeView;
    private  final  Game game;


    public ConsoleView(Game game)  {
        super();

        greetingView = new GreetingView();
        yesNotQuestionView = new YesNotQuestion();
        goodbyeView = new GoodbyeView();
        this.game = game;
        gameView = new GameView(game);
    }

    @Override
    public void start() {
        game.init();
        greetingView.interact();
    }

    @Override
    public void play() {
        gameView.interact();
    }

    @Override
    public boolean resume() {
        goodbyeView.interact();
        return yesNotQuestionView.read(Message.RESUME.value()).isAffirmative();

    }
}
