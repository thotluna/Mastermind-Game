import controllers.Logic;
import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;
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
        do {
            if(logic.getController() instanceof StartController){
                this.view.start((StartController) logic.getController());
            }else{
                if(logic.getController() instanceof PlayController){
                    this.view.play((PlayController) logic.getController());
                }else{
                    this.view.resume((ResumeController) logic.getController());
                }
            }

        } while (this.logic.hasController());
    }
}
