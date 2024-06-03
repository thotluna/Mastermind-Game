package view.consoles;

import controllers.Logic;
import type.Message;

public class HeadView extends ViewShow {
    private final Logic logic;
    public HeadView(Logic logic) {
        this.logic = logic;
    }

    @Override
    public void interact() {
          console.writeln(Message.N_ATTEMPTS.value(), logic.getNumberAttempts());
        console.writeln(logic.getSecretString());

        for (String attempt : logic.getAttempts()) {
            console.writeln(attempt);
        }
    }
}
