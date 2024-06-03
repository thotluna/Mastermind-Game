package view.consoles;

import controllers.PlayController;
import type.Message;

public class ResultAttemptView extends ViewShow {

    public void interact(PlayController controller) {
        if(controller.hasWinner()){
            console.writeln(Message.WON.value());
        }else{
            console.writeln(Message.LOSER.value());
        }
    }
}
