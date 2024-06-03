package view.consoles;

import controllers.PlayController;
import type.Message;

public class HeadView extends ViewShow {
    private final PlayController playController;
    public HeadView(PlayController playController) {
        this.playController = playController;
    }

    @Override
    public void interact() {
          console.writeln(Message.N_ATTEMPTS.value(), playController.getNumberAttempts());
        console.writeln(playController.getSecretString());

        for (String attempt : playController.getAttempts()) {
            console.writeln(attempt);
        }
    }
}
