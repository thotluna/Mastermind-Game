package view.consoles.menu;

import controllers.PlayController;
import type.Message;

public class UndoCommand extends Command{

    protected UndoCommand(PlayController controller) {
        super(Message.UNDO_COMMAND.value(), controller);
    }

    @Override
    public void execute() {
        controller.undo();
    }

    @Override
    public boolean isActive() {
        return controller.isUndoable();
    }
}
