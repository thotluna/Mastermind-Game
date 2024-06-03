package controllers;

import models.Game;
import models.State;

public abstract class Controller {

    protected final Game game;
    protected final State state;

    protected Controller(Game game, State state) {
        this.state = state;
        this.game = game;
    }

    public void nextState(){
        state.nextState();
    }

}
