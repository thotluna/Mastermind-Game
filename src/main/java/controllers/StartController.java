package controllers;

import models.Game;

public class StartController extends Controller {

    public StartController(Game game) {
        super(game);
    }

    public void start(){
        game.init();
    }
}
