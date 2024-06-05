package controllers;

import models.Game;

public abstract class Controller {

    protected final Game game;
    protected final Session session;

    protected Controller(Game game, Session session) {
        this.session = session;
        this.game = game;
    }

    public void nextState(){
        session.nextState();
    }

    public abstract void accept(ControllersVisitor controllersVisitor);

}
