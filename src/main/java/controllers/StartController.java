package controllers;

import models.Game;

public class StartController extends Controller {

    public StartController(Game game, Session session) {
        super(game, session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public void start(){
        game.init();
        session.nextState();
    }
}
