package models;

import type.ResultComparative;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_ATTEMPTS = 10;
    private List<Attempt> attempts;
    private Combination secret;

    public Game() {
        init();
    }

    public void init() {
        secret = new Combination(null);
        attempts = new ArrayList<>();
    }

    public String getSecretString() {
        return secret.toStringSecret();
    }

    public void calculateCombination(String proposedCombination) {
        Combination proposed = new Combination(proposedCombination);
        ResultComparative result = secret.compare(proposed);

        Attempt lastAttempt = new Attempt(result, proposed);
        attempts.add(lastAttempt);
    }

    public List<Attempt> getAttempts() {
        return attempts;
    }

    public int getNumberAttempts() {
        return attempts.size();
    }

    public Attempt getLastAttempt(){
        return attempts.get(attempts.size() -1);
    }

    public Boolean isNotGameOver(){
        return attempts.size() <= MAX_ATTEMPTS && getLastAttempt().isNoWinner();
    }

    public boolean hasWinner() {
        return getLastAttempt().isWinner();
    }

    public void reset() {
        this.init();
    }

    public Memento createMemento() {
        return new Memento(this.attempts);
    }

    public void setMemento(Memento memento){
        this.attempts = memento.getAttemptList();
    }
}
