package view.consoles.menu;

import controllers.PlayController;
import utils.CommandBase;

public abstract class Command extends CommandBase {
    protected final PlayController controller;

    protected Command(String title, PlayController controller) {
        super(title);
        this.controller = controller;
    }

}
