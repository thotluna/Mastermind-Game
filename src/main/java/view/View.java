package view;

import utils.Console;

public abstract class View {
    protected Console console;

    protected View() {
        this.console = Console.getInstance();
    }

    public abstract void interact();
}
