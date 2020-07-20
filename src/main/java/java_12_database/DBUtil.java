package java_12_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
                    "root", "coderslab"  );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
