import view.GraphicsView;
import view.View;

public class MastermindGraphics extends Mastermind {

    public MastermindGraphics() {
        super();
    }

    @Override
    protected View createView() {
        return new GraphicsView();
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }
}
