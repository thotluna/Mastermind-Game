package controllers;

import models.Attempt;
import models.Session;

import java.util.ArrayList;
import java.util.List;

public class PlayController extends Controller {

    public PlayController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

    public int getNumberAttempts() {
        return session.getNumberAttempts();
    }

    public boolean isNotGameOver() {
        return session.isNotGameOver();
    }

    public String getSecretString() {
        return session.getSecretString();
    }

    public List<String> getAttempts() {
        List<String> list = new ArrayList<>();
        for (Attempt attempt : session.getAttempts()) {
            list.add(attempt.toString());
        }
        return list;
    }

    public void calculateCombination(String combination) {
        session.calculateCombination(combination);
    }

    public boolean hasWinner() {
        return session.hasWinner();
    }

}
