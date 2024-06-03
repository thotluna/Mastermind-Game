package view.consoles;

import controllers.PlayController;
import controllers.validator.ValidatorHandler;
import type.Message;

public class ProposedView extends ViewShow {

    private final PlayController playController;

    public ProposedView(PlayController playController) {
        this.playController = playController;
    }

    @Override
    public void interact() {
        String error;
        String combination;
        ValidatorHandler validatorHandler = new ValidatorHandler();
        do {
            combination = console.readString(Message.PROPOSED.value());
            error = validatorHandler.validate(combination);
            if(error != null){
                console.writeError(error);
            }
        }while (error != null);

        playController.calculateCombination(combination);
    }
}
