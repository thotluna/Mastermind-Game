package controllers;

import models.Game;
import models.State;
import models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final State state;
    private final Map<StateValue, Controller> controllers;

    public Logic() {
        this.state = new State();
        Game game = new Game();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(game, state));
        this.controllers.put(StateValue.IN_GAME, new PlayController(game, state));
        this.controllers.put(StateValue.OUT_GAME, new ResumeController(game, state));
        this.controllers.put(StateValue.NULL, null);

    }
    public Controller getController() {
        return this.controllers.get(this.state.getState());
    }

    public boolean hasController(){
        return this.getController() != null;
    }
}
