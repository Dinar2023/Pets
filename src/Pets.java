import java.util.ArrayList;
import java.util.Date;

public class Pets extends Animal{
    ArrayList <String> commands = new ArrayList<>();
    private String type;
    private int id;
    private String name;
private Date birthDate;
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

    void setType (String type){
        this.type = type;
    }
    String getType(){
        return this.type;
    }

    void addCommand (String command) {
        command = command+"~";
        commands.add(command);
    }
    void deleteCommand (int id) {commands.remove(id);}

    ArrayList <String> getCommands() {
        return this.commands;
    }
}
