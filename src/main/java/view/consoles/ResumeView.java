package view.consoles;

import controllers.ResumeController;
import type.Message;
import utils.YesNotQuestion;

public class ResumeView{
    private final GoodbyeView goodbyeView;
    private final ResumeController resumeController;

    public ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
        goodbyeView = new GoodbyeView();
    }

    public Boolean interact() {
        boolean isResume = new YesNotQuestion().read(Message.RESUME.value()).isAffirmative();
        if(isResume){
            resumeController.resume();
        }else{
            goodbyeView.interact();
        }
       return isResume;
    }
}
