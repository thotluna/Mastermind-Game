package controllers;

import models.Game;

public abstract class Controller {

    protected final Game game;

    protected Controller(Game game) {
        this.game = game;
    }

}
