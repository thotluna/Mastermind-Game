package view.consoles;

import controllers.Logic;
import type.Message;
import utils.YesNotQuestion;

public class ResumeView{
    private final GoodbyeView goodbyeView;
    private final Logic logic;

    public ResumeView(Logic logic) {
        this.logic = logic;
        goodbyeView = new GoodbyeView();
    }

    public Boolean interact() {
        boolean isResume = new YesNotQuestion().read(Message.RESUME.value()).isAffirmative();
        if(isResume){
            logic.resume();
        }else{
            goodbyeView.interact();
        }
       return isResume;
    }
}
