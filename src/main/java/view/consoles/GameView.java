package view.consoles;

import controllers.PlayController;

public class GameView extends ViewShow {

    private final PlayController playController;
    private final HeadView headView;
    private final ProposedView proposedView;
    private final ResultAttemptView resultAttemptView;


    public GameView(PlayController playController) {
        this.playController = playController;
        headView = new HeadView(playController);
        proposedView = new ProposedView(playController);
        resultAttemptView = new ResultAttemptView(playController);
    }

    @Override
    public void interact() {
        do {
            headView.interact();
            proposedView.interact();
        }while (playController.isNotGameOver());
        resultAttemptView.interact();
    }
}
