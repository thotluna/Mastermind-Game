import models.Game;
import view.GraphicsView;
import view.View;

public class MastermindGraphics extends Mastermind {

    @Override
    protected View createView(Game game) {
        return new GraphicsView(game);
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }

}
