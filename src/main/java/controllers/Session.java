package controllers;

import models.Game;
import models.State;
import models.StateValue;

public class Session {
    private final Game game;
    private final State state;

    public Session(Game game) {
        this.game = game;
        this.state = new State();
    }

    public void reset(){
        state.reset();
    }

    public void nextState(){
        state.nextState();
    }

    public StateValue getStateValue(){
        return state.getState();
    }


}
