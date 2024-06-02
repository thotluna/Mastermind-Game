package view.consoles;

import type.Message;

public class GreetingView extends ViewShow {
    @Override
    public void interact() {
        console.writeln(Message.GREETING.value());
        console.writeln("");
    }
}
