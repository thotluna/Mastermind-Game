import models.Game;
import view.View;

public abstract class Mastermind {
    protected View view;

    protected Mastermind() {
        Game game = new Game();
        view = createView(game);
    }

    protected abstract View createView(Game game);

    public void play(){
        do {
            this.view.start();
            this.view.play();
        } while (this.view.resume());
    }
}
