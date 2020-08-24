package java_11;

import java.sql.Connection;

public class MainTest {
    public static void main(String[] args) {
        Connection bank = DbUtil.connect("bank");
    }
}
