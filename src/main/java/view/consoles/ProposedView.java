package view.consoles;

import models.Game;
import models.validator.ValidatorHandler;
import type.Message;

public class ProposedView extends ViewShow {

    private final Game game;

    public ProposedView(Game game) {
        this.game = game;
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

        game.calculateCombination(combination);
    }
}
