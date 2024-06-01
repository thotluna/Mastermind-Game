package type;

public enum Message {
    GREETING("---- WELCOME ----"),
    N_ATTEMPTS("%d Attempts"),
    PROPOSED("Propose a combination: "),
    WON("You've won!!! ;-)"),
    LOSER("You've lost!!! :-("),
    RESUME("Do you want to continue?"),
    GOODBYE("Bye...");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String value(){
        return message;
    }
}
