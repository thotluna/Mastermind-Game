package view.consoles;

import type.Message;

public class GoodbyeView extends ViewShow {
    public void interact() {
        console.writeln(Message.GOODBYE.value());
    }
}
