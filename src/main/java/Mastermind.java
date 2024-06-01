import view.ConsoleView;

public class Mastermind {

    private final ConsoleView consoleView;

    public Mastermind() {
        consoleView = new ConsoleView();
    }

    public void play(){
       consoleView.interact();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
