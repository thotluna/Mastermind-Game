package view;

import type.Message;

public class GreetingView extends View {
    @Override
    public void interact() {
        console.writeln(Message.GREETING.value());
        console.writeln("");
    }
}
