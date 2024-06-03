package view;

import controllers.PlayController;
import controllers.ResumeController;
import controllers.StartController;

public interface View {
    void start(StartController controller);

    void play(PlayController controller);

    void resume(ResumeController controller);
}
