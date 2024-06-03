package view.consoles;

import controllers.ResumeController;
import type.Message;
import utils.YesNotQuestion;

public class ResumeView{
    private final GoodbyeView goodbyeView;

    public ResumeView() {
        goodbyeView = new GoodbyeView();
    }

    public void interact(ResumeController controller) {
        boolean isResume = new YesNotQuestion().read(Message.RESUME.value()).isAffirmative();
        if(isResume){
            controller.resume();
        }else{
            goodbyeView.interact();
            controller.nextState();
        }
    }
}
