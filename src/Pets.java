import java.util.ArrayList;
import java.util.Date;

public class Pets {
    ArrayList <String> commands = new ArrayList<>();
    ArrayList<String> commandList = new ArrayList<>();
    private String type = "pet";

    private int id;
    private String name;
private Date birthDate;
    void setId (int id){this.id = id;}
    void setName (String name){
        this.name = name;
    }
        String getName(){
        return this.name;
    }
    void setBirthDate (Date date) {this.birthDate = date;}
    Integer getID () { return this.id;}

    public Date getBirthDate() {
        return birthDate;
    }


    String getType(){
        return this.type;
    }

    void addCommand (String command) {

        commands.add(command);
    }
    void deleteCommand (int id) {commands.remove(id);}

    ArrayList <String> getCommands() {
        return this.commands;
    }

    ArrayList <String> getCommandList() {
        return this.commandList;
    }

}
