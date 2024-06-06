package models;

import java.util.List;

public class Session {
    private final Game game;
    private final State state;
    private final Registry registry;

    public Session(Game game) {
        this.game = game;
        this.state = new State();
        this.registry = new Registry(game);
    }

    public void reset(){
        this.game.reset();
        this.state.reset();
        this.registry.reset();
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

    public void register(){
        this.registry.register();
    }

    public void undo() {
        this.registry.undo();
    }

    public boolean isUndoable(){
        return this.registry.undoable();
    }

    public void redo() {
        this.registry.redo();
    }

    public boolean isRedoable(){
        return this.registry.redoable();
    }


}
