package lv.battlejam.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionController {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://91.105.87.91/battlejam";

    static final private String USER = "dbcon";

    static final private String PASS = "@BattleJam";

    static private Connection conn = null;

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (final SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static Connection getDataSource() {

      
        return conn;
    }
}
