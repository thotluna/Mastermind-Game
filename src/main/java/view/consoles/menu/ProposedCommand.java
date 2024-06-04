package view.consoles.menu;

import controllers.PlayController;
import type.Message;
import view.consoles.ProposedView;

public class ProposedCommand extends Command {

    public ProposedCommand(PlayController controller ) {
        super(Message.PROPOSED_COMMAND.value(), controller);
    }

    @Override
    public void execute() {
        new ProposedView().interact(controller);
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
