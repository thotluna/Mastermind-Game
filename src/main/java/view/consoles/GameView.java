package view.consoles;

import controllers.PlayController;

public class GameView extends ViewShow {
    private final HeadView headView;
    private final ProposedView proposedView;
    private final ResultAttemptView resultAttemptView;

    public GameView() {
        headView = new HeadView();
        proposedView = new ProposedView();
        resultAttemptView = new ResultAttemptView();
    }

    public void interact(PlayController controller) {
        do {
            headView.interact(controller);
            proposedView.interact(controller);
        }while (controller.isNotGameOver());
        resultAttemptView.interact(controller);
        controller.nextState();
    }
}
