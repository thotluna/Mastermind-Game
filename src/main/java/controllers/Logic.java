package controllers;

import models.Game;

import java.util.List;

public class Logic {

    private final StartController startController;
    private final PlayController playController;
    private final ResumeController resumeController;

    public Logic(Game game) {
        this.startController = new StartController(game);
        this.playController = new PlayController(game);
        this.resumeController = new ResumeController(game);
    }

    public void start(){
        startController.start();
    }


    public void resume() {
        resumeController.resume();
    }

    public boolean isNotGameOver() {
        return playController.isNotGameOver();
    }

    public int getNumberAttempts() {
        return playController.getNumberAttempts();
    }

    public String getSecretString() {
        return playController.getSecretString();
    }

    public List<String> getAttempts() {
        return playController.getAttempts();
    }

    public boolean hasWinner() {
        return playController.hasWinner();
    }

    public void calculateCombination(String combination) {
        playController.calculateCombination(combination);
    }
}
