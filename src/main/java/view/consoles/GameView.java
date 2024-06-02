package view.consoles;

import models.Game;

public class GameView extends ViewShow {

    private final Game game;
    private final HeadView headView;
    private final ProposedView proposedView;
    private final ResultAttemptView resultAttemptView;


    public GameView(Game game) {
        this.game = game;
        headView = new HeadView(game);
        proposedView = new ProposedView(game);
        resultAttemptView = new ResultAttemptView(game);
    }

    @Override
    public void interact() {
        do {
            headView.interact();
            proposedView.interact();
        }while (game.isNotGameOver());
        resultAttemptView.interact();
    }
}
