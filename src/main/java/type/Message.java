package type;

public enum Message {
    GREETING("---- WELCOME ----"),
    N_ATTEMPTS("%d Attempts"),
    PROPOSED("Propose a combination: "),
    WON("You've won!!! ;-)"),
    LOSER("You've lost!!! :-("),
    RESUME("Do you want to continue?"),
    GOODBYE("Bye..."),
    PLAY_MENU_TITLE("Precione el numero de la opción deceado: "),
    PROPOSED_COMMAND("Intentarlo"),
    REDO_COMMAND("Redo"),
    UNDO_COMMAND("Undo");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String value(){
        return message;
    }
}
