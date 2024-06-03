package controllers;

import models.Game;
import models.State;

public class ResumeController extends Controller{
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void resume() {
        game.init();
        state.reset();
    }

}
