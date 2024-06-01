package view;

import type.Message;

public class GoodbyeView extends View {
    @Override
    public void interact() {
        console.writeln(Message.GOODBYE.value());
    }
}
