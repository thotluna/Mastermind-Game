package models;

import type.ResultComparative;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_ATTEMPTS = 10;

    private final List<Attempt> attempts;
    private final Combination secret;

    private final Player player;

    public Game(Player player) {
        secret = new SecretCombination(null);
        this.player = player;
        attempts = new ArrayList<>();
    }

    public void play() {
        Attempt lastAttempt;
        do{
            player.showHead(attempts.size(), secret.toStringSecret(), attempts);

            Combination proposed = new Combination(player.getProposedCombination());
            ResultComparative result = secret.compare(proposed);

            lastAttempt = new Attempt(result, proposed);
            attempts.add(lastAttempt);


        }while(attempts.size() <= MAX_ATTEMPTS && lastAttempt.isNoWinner() );

        player.signResult(lastAttempt.isWinner());
    }
}
