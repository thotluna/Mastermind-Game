package models;

public class State {
    private StateValue state;

    public State() {
        this.reset();
    }

    public void reset(){
        this.state = StateValue.INITIAL;
    }

    public void nextState(){
        this.state = StateValue.values()[this.state.ordinal() + 1];
    }

    public StateValue getState(){
        return this.state;
    }
}
