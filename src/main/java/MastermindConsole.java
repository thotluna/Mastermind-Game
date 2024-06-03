import view.ConsoleView;
import view.View;

public class MastermindConsole extends Mastermind {

    public MastermindConsole() {
        super();
    }

    @Override
    protected View createView() {
        return new ConsoleView();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }
}
