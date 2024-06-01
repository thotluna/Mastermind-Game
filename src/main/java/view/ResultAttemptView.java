package view;

import models.Game;
import type.Message;

public class ResultAttemptView extends View {
    private final Game game;

    public ResultAttemptView(Game game) {
        this.game = game;
    }

    @Override
    public void interact() {
        if(game.hasWinner()){
            console.writeln(Message.WON.value());
        }else{
            console.writeln(Message.LOSER.value());
        }
    }
}
