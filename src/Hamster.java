import java.util.ArrayList;

public class Hamster extends Pets {
    private String type = "humster";


    void fillcommandList() {
        commandList.add("Run");
        commandList.add("Stay");
        commandList.add("Eat");
        commandList.add("Tap");
        commandList.add("Sleep");
    }
}
