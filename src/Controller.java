import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Controller {
    ArrayList <Pets> pets = new ArrayList<Pets>();
    ViewCons viewCons = new ViewCons();
void start(){
    int id =1;
    while (true) {

        String choise = viewCons.getUserChoise();
        if (choise.equals("1")) {
            String choisePet = viewCons.getTypePet();
            if (choisePet.equals("1")){
                Cats cat = new Cats();
                cat.setName(viewCons.setPetName());
                cat.setBirthDate(viewCons.setBirthDate());
                cat.fillcommandList();
                pets.add(cat);
                cat.setId(id);
                id++;
            }
            if (choisePet.equals("2")){
                Dogs dog = new Dogs();
                dog.setName(viewCons.setPetName());
                dog.setBirthDate(viewCons.setBirthDate());
                dog.fillcommandList();
                pets.add(dog);
                dog.setId(id);
                id++;
            }
            if (choisePet.equals("3")){
                Hamster hamster = new Hamster();
                hamster.setName(viewCons.setPetName());
                hamster.setBirthDate(viewCons.setBirthDate());
                hamster.fillcommandList();
                pets.add(hamster);
                hamster.setId(id);
                id++;
            }

        }
        if (choise.equals("2")) {
            ArrayList <Pets> sortedPets= pets;
            sortedPets.sort(Comparator.comparing(Pets::getBirthDate));
           viewCons.printPets(sortedPets);
        };

        if (choise.equals("3")){
            int choiseID = viewCons.choiseID(pets)-1;
            Pets learPet = pets.get(choiseID);
            String newCommand = viewCons.newCommand(learPet);
            if (newCommand != null) {
                pets.get(choiseID).addCommand(newCommand);
            }


        }



        if (choise.equals("0")) break;

    }
}

}
