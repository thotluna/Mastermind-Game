package view.consoles;

import utils.Console;

public abstract class ViewShow {
    protected final Console console;

    protected ViewShow() {
        this.console = Console.getInstance();
    }

}
