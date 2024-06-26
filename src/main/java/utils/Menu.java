package utils;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<CommandBase> commandList;
    private final String title;

    private final Console console;

    public Menu(String title) {
        this.title = title;
        this.commandList = new ArrayList<>();
        this.console = Console.getInstance();
    }

    public void addCommand(CommandBase command){
        commandList.add(command);
    }

    public void execute(){
        List<CommandBase> commands =getCommandListActive();
        assert !commands.isEmpty();
        String error = null;
        int posibleComenad;
        do {
            for (int i = 0; i < commands.size(); i++) {
                console.writeln("%d.- %S", i+1, commands.get(i).getTitle());
            }

            console.writeln("");

            posibleComenad = Console.getInstance().readInt(title);

            if(posibleComenad < 1 || posibleComenad > commands.size()){
                error = "error";
                console.writeError("Only numbers between 1 and" + commands.size() + "allowed " );
            }
        }while (error != null);
        commands.get(posibleComenad -1).execute();
    }

    private List<CommandBase> getCommandListActive(){
        return commandList.stream().filter(CommandBase::isActive).toList();
    }
}
