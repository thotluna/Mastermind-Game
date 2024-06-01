package models;

import type.ResultComparative;

public class Attempt {
    private final ResultComparative result;
    private final Combination proposed;

    public Attempt(ResultComparative result, Combination proposed) {
        this.result = result;
        this.proposed = proposed;
    }

    public boolean isWinner() {
        return result.black() == Combination.NUMBER_COLORS;
    }

    public boolean isNoWinner() {
        return result.black() < Combination.NUMBER_COLORS;
    }

    @Override
    public String toString() {
        return proposed.toString() + " --> "+ result.black() +" blacks and "+ result.white() +" whites";
    }
}
