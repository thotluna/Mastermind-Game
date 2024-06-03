package controllers;

import models.Attempt;
import models.Game;

import java.util.ArrayList;
import java.util.List;

public class PlayController extends Controller {

    public PlayController(Game game) {
        super(game);
    }

    public int getNumberAttempts() {
        return game.getNumberAttempts();
    }

    public boolean isNotGameOver() {
        return game.isNotGameOver();
    }

    public String getSecretString() {
        return game.getSecretString();
    }

    public List<String> getAttempts() {
        List<String> list = new ArrayList<>();
        for (Attempt attempt : game.getAttempts()) {
            list.add(attempt.toString());
        }
        return list;
    }

    public void calculateCombination(String combination) {
        game.calculateCombination(combination);
    }

    public boolean hasWinner() {
        return game.hasWinner();
    }
}
