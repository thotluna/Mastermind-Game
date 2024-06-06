package view.consoles.menu;

import controllers.PlayController;
import type.Message;

public class RedoCommand extends Command{
    protected RedoCommand(PlayController controller) {
        super(Message.REDO_COMMAND.value(), controller);
    }

    @Override
    public void execute() {
        controller.redo();
    }

    @Override
    public boolean isActive() {
        return controller.isRedoable();
    }
}
