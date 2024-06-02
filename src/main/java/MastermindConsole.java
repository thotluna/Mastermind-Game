import view.ConsoleView;

public class MastermindConsole {

    private final ConsoleView consoleView;

    public MastermindConsole() {
        consoleView = new ConsoleView();
    }

    public void play(){
       consoleView.interact();
    }

    public static void main(String[] args) {
        new MastermindConsole().play();
    }
}
