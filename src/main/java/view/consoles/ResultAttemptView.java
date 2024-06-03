package view.consoles;

import controllers.PlayController;
import type.Message;

public class ResultAttemptView extends ViewShow {
    private final PlayController playController;

    public ResultAttemptView(PlayController playController) {
        this.playController = playController;
    }

    @Override
    public void interact() {
        if(playController.hasWinner()){
            console.writeln(Message.WON.value());
        }else{
            console.writeln(Message.LOSER.value());
        }
    }
}
