package controllers;

public interface ControllersVisitor {
    void visit(StartController startController);
    void visit(PlayController playController);
    void visit(ResumeController resumeController);
}
