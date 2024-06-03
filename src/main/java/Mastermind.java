import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
import models.Game;
import view.View;

public abstract class Mastermind {

    protected final View view;
    protected final StartController startController;
    protected final PlayController playController;
    protected final ResumeController resumeController;
    protected final Game game;

    protected Mastermind() {
        game = new Game();
        startController = new StartController(game);
        playController = new PlayController(game);
        resumeController = new ResumeController(game);
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
