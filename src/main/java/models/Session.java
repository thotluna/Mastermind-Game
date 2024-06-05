package models;

import java.util.List;

public class Session {
    private final Game game;
    private final State state;

    public Session(Game game) {
        this.game = game;
        this.state = new State();
    }

    public void reset(){
        this.game.reset();
        state.reset();
    }

    public void nextState(){
        state.nextState();
    }

    public StateValue getStateValue(){
        return state.getState();
    }


    public String getSecretString() {
        return game.getSecretString();
    }

    public int getNumberAttempts(){
        return game.getNumberAttempts();
    }

    public List<Attempt> getAttempts(){
        return game.getAttempts();
    }

    public boolean isNotGameOver() {
        return game.isNotGameOver();
    }

    public void calculateCombination(String combination) {
        game.calculateCombination(combination);
    }

    public boolean hasWinner() {
        return game.hasWinner();
    }


}
