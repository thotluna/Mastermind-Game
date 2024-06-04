package view.consoles.menu;

import controllers.PlayController;
import utils.Menu;

public class GameMenu extends Menu {

    public GameMenu(PlayController controller, String title) {
        super(title);
        this.addCommand(new ProposedCommand(controller));


    }
}
