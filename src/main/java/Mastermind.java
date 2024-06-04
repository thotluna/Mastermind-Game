import controllers.Controller;
import controllers.Logic;
import view.View;

public abstract class Mastermind {

    protected final Logic logic;
    protected final View view;

    protected Mastermind() {
        logic = new Logic();
        view = createView();
    }

    protected abstract View createView();

    public void play(){
        Controller controller;
        do {
            controller = logic.getController();
            if(controller != null){
                controller.accept(this.view);
            }

        } while (this.logic.hasController());
    }
}
