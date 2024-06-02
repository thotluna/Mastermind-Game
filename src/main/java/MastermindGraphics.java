import view.GraphicsView;

public class MastermindGraphics {

    private final GraphicsView graphicsView;

    public MastermindGraphics() {
        graphicsView = new GraphicsView();
    }

    public void play(){
       graphicsView.interact();
    }

    public static void main(String[] args) {
        new MastermindGraphics().play();
    }

}
