package controllers;

import models.Game;

public class ResumeController extends Controller{
    public ResumeController(Game game) {
        super(game);
    }

    public void resume() {
        game.init();
    }
}
