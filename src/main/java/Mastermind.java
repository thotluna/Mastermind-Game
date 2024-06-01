import models.Game;
import models.Player;
import type.Message;
import utils.YesNotQuestion;

public class Mastermind {

    private final Player player;

    public Mastermind() {
        player = new Player();
    }

    public void play(){
        do {
            player.greeting();
            new Game(player).play();
        }while (new YesNotQuestion().read(Message.RESUME.value()).isAffirmative());
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
