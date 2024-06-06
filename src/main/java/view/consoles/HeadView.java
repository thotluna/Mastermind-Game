package view.consoles;

import controllers.PlayController;
import type.Message;

public class HeadView extends ViewShow {

    public void interact(PlayController playController) {
        console.writeln(Message.N_ATTEMPTS.value(), playController.getNumberAttempts());
        console.writeln(playController.getSecretString());

        for (String attempt : playController.getAttempts()) {
            console.writeln(attempt);
        }
        console.writeln("");
    }
}
