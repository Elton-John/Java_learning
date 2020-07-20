package java_12_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        update(CREATE_USER_QUERY,"Jjjjj","llkj@mail");
        read(SHOW_USERS_QUERY);

        try (Connection conn = DBUtil.connect()) {
            execute(conn,SHOW_USERS_QUERY);
            execute(conn, CREATE_USER_QUERY);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static final String CREATE_USER_QUERY = "INSERT INTO users (name, email) VALUES (?,?);";
    private static final String SHOW_USERS_QUERY = "SELECT * FROM users;";

    public static void update(String query, String name, String email) {
        try (Connection connection = DBUtil.connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void read(String query) {
        try (Connection connection = DBUtil.connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void execute(Connection conn, String query) {
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int getInt(String message){
        int result;
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Not a whole number. Try again: ");
            scanner.next();
        }
        result = scanner.nextInt();
        return result;
    }

    public static double getDouble(String message){
        System.out.println(message  );
        double result;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            System.out.println("Not a number. Try again: ");
            scanner.next();
        }
        result = scanner.nextDouble();
        return result;
    }

    public static String pobierzZKonsoli (String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
