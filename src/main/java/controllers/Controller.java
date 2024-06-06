package controllers;

import models.Session;

public abstract class Controller {

    protected final Session session;

    protected Controller(Session session) {
        this.session = session;
    }

    public void nextState(){
        session.nextState();
    }

    public abstract void accept(ControllersVisitor controllersVisitor);

}
