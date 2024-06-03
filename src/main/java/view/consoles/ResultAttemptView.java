package view.consoles;

import controllers.Logic;
import type.Message;

public class ResultAttemptView extends ViewShow {
    private final Logic logic;

    public ResultAttemptView(Logic logic) {
        this.logic = logic;
    }

    @Override
    public void interact() {
        if(logic.hasWinner()){
            console.writeln(Message.WON.value());
        }else{
            console.writeln(Message.LOSER.value());
        }
    }
}
