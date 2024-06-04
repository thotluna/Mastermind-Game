package controllers;

import models.Game;
import models.State;

public class ResumeController extends Controller{
    public ResumeController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public void resume() {
        game.init();
        state.reset();
    }

}
