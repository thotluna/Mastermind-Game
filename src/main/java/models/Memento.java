package models;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private final List<Attempt> attemptList;

    public Memento(List<Attempt> attemptList) {
        this.attemptList = List.copyOf(attemptList);
    }

    public List<Attempt> getAttemptList() {
        return new ArrayList<>(List.copyOf(attemptList));
    }
}
