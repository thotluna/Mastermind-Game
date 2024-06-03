package view.consoles;

import controllers.Logic;
import controllers.validator.ValidatorHandler;
import type.Message;

public class ProposedView extends ViewShow {

    private final Logic logic;

    public ProposedView(Logic logic) {
        this.logic = logic;
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

        logic.calculateCombination(combination);
    }
}
