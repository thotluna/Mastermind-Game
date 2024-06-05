package controllers;

import models.Game;

public class ResumeController extends Controller{
    public ResumeController(Game game, Session session) {
        super(game, session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public void resume() {
        game.init();
        session.reset();
    }

}
