import controllers.Logic;
import models.Game;
import view.View;

public abstract class Mastermind {

    protected final Logic logic;
    protected final View view;


    protected Mastermind() {
        logic = new Logic(new Game());
        view = createView();
    }

    protected abstract View createView();

    public void play(){
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }
}
