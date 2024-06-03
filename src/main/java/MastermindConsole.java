import models.Game;
import view.ConsoleView;
import view.View;

public class MastermindConsole extends Mastermind {

    @Override
    protected View createView(Game game) {
        return new ConsoleView(game);
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }
}
