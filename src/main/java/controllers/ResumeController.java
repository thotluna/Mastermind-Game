package controllers;

import models.Session;

public class ResumeController extends Controller{

    public ResumeController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public void resume() {
        session.reset();
    }

}
