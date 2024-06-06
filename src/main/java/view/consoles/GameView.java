package view.consoles;

import controllers.PlayController;
import type.Message;
import view.consoles.menu.GameMenu;

public class GameView extends ViewShow {
    private final HeadView headView;
    private final ResultAttemptView resultAttemptView;

    public GameView() {
        headView = new HeadView();
        resultAttemptView = new ResultAttemptView();
    }

    public void interact(PlayController controller) {
        do {
            headView.interact(controller);
            new GameMenu(controller, Message.PLAY_MENU_TITLE.value()).execute();
        }while (controller.isNotGameOver());
        resultAttemptView.interact(controller);
        controller.nextState();
    }
}
