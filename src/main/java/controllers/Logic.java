package controllers;

import models.Game;
import models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    private final Session session;
    private final Map<StateValue, Controller> controllers;

    public Logic() {
        Game game = new Game();
        this.session = new Session(game);
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(game, session));
        this.controllers.put(StateValue.IN_GAME, new PlayController(game, session));
        this.controllers.put(StateValue.OUT_GAME, new ResumeController(game, session));
        this.controllers.put(StateValue.NULL, null);

    }
    public Controller getController() {
        return this.controllers.get(this.session.getStateValue());
    }

    public boolean hasController(){
        return this.getController() != null;
    }
}
