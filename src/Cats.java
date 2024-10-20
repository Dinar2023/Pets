import java.util.ArrayList;

public class Cats extends Pets {
    private String type = "cat";
    ArrayList<String> commands = new ArrayList<>();



    void fillcommandList (){
        commandList.add("Sit");
        commandList.add("Meaw");
        commandList.add("Eat");
        commandList.add("Sleep");
    }




}
