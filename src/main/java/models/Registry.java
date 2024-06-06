package models;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    private final Game game;
    private List<Memento> mementos;
    private int firstPreview;

    public Registry(Game game) {
        this.game = game;
        reset();
    }

    @SuppressWarnings("ListRemoveInLoop")
    public void register(){
        for (int i = 0; i < firstPreview; i++) {
            mementos.remove(0);
        }
        this.firstPreview = 0;
        mementos.add(firstPreview, game.createMemento());
    }

    public void reset(){
        this.mementos = new ArrayList<>();
        firstPreview = 0;
    }

    public void undo() {

        this.firstPreview++;
        this.game.setMemento(mementos.get(firstPreview));
    }

    public boolean undoable(){
        return !mementos.isEmpty() && this.firstPreview < this.mementos.size() - 1;
    }


    public void redo() {
        this.firstPreview--;
        this.game.setMemento(mementos.get(firstPreview));
    }

    public boolean redoable(){
        return this.firstPreview >= 1;
    }




}
