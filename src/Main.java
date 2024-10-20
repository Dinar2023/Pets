import java.sql.*;

public class Main {
        public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/my_database?useSSL=false&amp;serverTimezone=UTC";
//        String user = "root";
//        String password = ".4dHtLD458M8Xh";
//
//        try {
//            Connection connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Подключение к базе данных успешно установлено!");
//            connection.close();
//        } catch (SQLException e) {
//            System.out.println("Ошибка при подключении к базе данных:");
//            e.printStackTrace();
//        }
            Controller controller = new Controller();
            controller.start();
    }
}