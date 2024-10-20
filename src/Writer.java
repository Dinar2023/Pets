import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Writer {

    void writePeopleToFile(Pets animal) {
        try (FileWriter writer = new FileWriter(animal.getName(), true)) {
//            writer.append(people.getName()+" "+people.getSecondName()+" "+people.getThirdName()+" "+people.getStrDateBirh()+" "+people.getStrPhoneNumber()+" "+people.getSex() +"\n");
            java.io.Writer append = writer.append(animal.getID().toString()).append(animal.getName()).append(" ").append(animal.getType()).append(" ").append(animal.getBirthDate().toString()).append(" comands:").append(animal.getCommands().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
