package view.consoles;

import controllers.Logic;

public class GameView extends ViewShow {

    private final Logic logic;
    private final HeadView headView;
    private final ProposedView proposedView;
    private final ResultAttemptView resultAttemptView;


    public GameView(Logic logic) {
        this.logic = logic;
        headView = new HeadView(logic);
        proposedView = new ProposedView(logic);
        resultAttemptView = new ResultAttemptView(logic);
    }

    @Override
    public void interact() {
        do {
            headView.interact();
            proposedView.interact();
        }while (logic.isNotGameOver());
        resultAttemptView.interact();
    }
}
