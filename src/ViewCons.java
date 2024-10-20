import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class ViewCons {
    Scanner scanner = new Scanner(System.in);
    String getUserChoise (){

        System.out.println("""
                Введите что вы хотите сделать:
                1: Добавить животное PETS
                2: Посмотреть животных
                3: Обучить новым командам
                0: Выход""");
        return scanner.nextLine();

    }
    String getTypePet(){
        System.out.println("""
                Кого вы хотите добавить:
                1: Кошку
                2: Собаку
                3: Хомяка
                0: Выход""");
        return scanner.nextLine();
    }

    String setPetName(){
        System.out.println("Введите имя животного");
        return scanner.nextLine();
    }

    Date setBirthDate(){
        System.out.println("Введите дату рождения");
        String dateStr = scanner.nextLine();
        Date date = new Date();
        try {
            date  = new SimpleDateFormat("d.MMM.yyyy").parse(dateStr);

        } catch (ParseException e) {
            try {
                date  = new SimpleDateFormat("d.M.yyyy").parse(dateStr);
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        }
        return date;
    }
    void printPets (ArrayList<Pets> pets){
        int i = 0;
        while (i < pets.size() ){
            System.out.print("id= "+ pets.get(i).getID()+" ");
            System.out.print("type= "+ pets.get(i).getType()+" ");
            System.out.print("name= "+ pets.get(i).getName()+" ");
            System.out.print("birth date= "+ pets.get(i).getBirthDate()+" ");
            System.out.println("commands= "+ pets.get(i).getCommands()+" ");
            i++;
        }

    }
int choiseID(ArrayList<Pets> pets){
    System.out.println("Введит ID животного, которому хотите добавить команду");
    printPets(pets);
    int id = scanner.nextInt();
    return id;
}

String newCommand (Pets pets) {
    System.out.println("Введите id команду которой будете учит");
    System.out.println(pets.getCommandList());

    while (true) {
        String res = scanner.nextLine();
        if (pets.getCommands().contains(res)) {
            System.out.println("Такая комаенда уже изучена");
            return null;
        }
        else {
            if (pets.getCommandList().contains(res)) return res;
            else {
                System.out.println("Такой команды нет");
            }
        }
    }

}


}
