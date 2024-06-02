package view.consoles;

import type.Message;

public class GoodbyeView extends ViewShow {
    @Override
    public void interact() {
        console.writeln(Message.GOODBYE.value());
    }
}
