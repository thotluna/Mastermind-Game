package models;

import models.validator.ValidatorHandler;
import type.Message;
import utils.Console;

import java.util.List;

public class Player {

    private final Console console;

    public Player() {
        console = Console.getInstance();
    }

    public void greeting() {
        console.writeln(Message.GREETING.value());
    }

    public void showHead(int nAttempts, String secret, List<Attempt> attempts) {
        console.writeln(Message.N_ATTEMPTS.value(), nAttempts);
        console.writeln(secret);
        for (Attempt attempt : attempts) {
            console.writeln(attempt.toString());
        }
    }

    public String getProposedCombination() {
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

        return combination;
    }

    public void signResult(boolean isWinner){
        if(isWinner){
            console.writeln(Message.WON.value());
        }else{
            console.writeln(Message.LOSER.value());
        }
    }
}
