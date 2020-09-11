package java_11;

import java_12_database.DBUtil;

import java.sql.*;

public class BankAccountDao {

    public static Connection connectToBank() {
        try (Connection connectToBank = utils.DbUtil.getConnection()) {
            return connectToBank;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static final String CREATE_QUERY = "INSERT INTO bank_account (name, surname, pesel, cash) VALUES (?,?,?,?);";

    public static BankAccount create(BankAccount bankAccount) {
        System.out.println(bankAccount.getName());
        System.out.println("wejście");
        try (Connection conn = utils.DbUtil.getConnection()) {
            System.out.println(" w try");
            PreparedStatement statement = conn.prepareStatement(CREATE_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);  //error
            System.out.println("kuku");
            statement.setString(1, bankAccount.getName());
            statement.setString(2, bankAccount.getSurname());
            statement.setString(3, bankAccount.getPesel());
            statement.setInt(4, 0);
            statement.executeUpdate();
            System.out.println("po execute");
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                bankAccount.setId(resultSet.getInt(1));

            }
            return bankAccount;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
//    public static BankAccount create(BankAccount bankAccountWithoutId) {
//
//        String name = bankAccountWithoutId.getName();
//        String surname = bankAccountWithoutId.getSurname();
//        String pesel = bankAccountWithoutId.getPesel();
//        System.out.println(name + surname + pesel);
//
//        try (Connection connection = DbUtil.connect("bank")) {
//            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, surname);
//            preparedStatement.setString(3, pesel);
//            preparedStatement.executeUpdate();
//            ResultSet resultSet = preparedStatement.getGeneratedKeys();
//            System.out.println("czy to w ogóle dziala");
//            int id = 0;
//            if (resultSet.next()) {
//                id = resultSet.getInt(1);
//                System.out.println(id);
//            }
//
//            BankAccount bankAccount = new BankAccount(id, name, surname, pesel, 0.0);
//            return bankAccount;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//
//    }
}

