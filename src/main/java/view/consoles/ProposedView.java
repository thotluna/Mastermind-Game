package view.consoles;

import controllers.PlayController;
import controllers.validator.ValidatorHandler;
import type.Message;

public class ProposedView extends ViewShow {

    public void interact(PlayController controller) {
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

        controller.calculateCombination(combination);
    }
}
