import java.util.Scanner;

public class ViewCons {
    Scanner scanner = new Scanner(System.in);
    String getUserChoise (){

        System.out.println("""
                Введите что вы хотите сделать:
                1: Посмотреть животных PETS
                2: Посмотреть животных PackAnimals
                устанавливается не абсолютный шанс выпадения, а приоритет, относительно других игрушек)
                3: Добавить животное PETS
                4: Добавить животное PackAnimals
                5: Посмотреть животное
                0: Выход""");
        return scanner.nextLine();

    }

    String setToyName(){
        System.out.println("Введите имя игрушки");
        return scanner.nextLine();
    }

    int setToyNumbers(){
        System.out.println("Введите колличество игрушек");
        int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }

    double setToyChance(){
        while (true) {
            System.out.println("Введите шанс выпадения игрушки (от 0 до 100)");
            double res = scanner.nextDouble();
            scanner.nextLine();
            if (res>=0 && res <= 100) return res;
            else System.out.println("Не корректное число. Вероятност выпадения должна быть от 0 до 100");
        }
    }

    void printMessage(String text){
        System.out.println(text);
    }



}
