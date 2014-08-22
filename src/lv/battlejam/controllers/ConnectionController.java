package lv.battlejam.controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionController {

    static private Connection conn = null;

    static {
        init();
    }

    public static Connection getDataSource() {

        return conn;
    }

    public static void init() {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://91.105.87.91:3306/battle_jam";
        String USER = "dbcon";
        String PASS = "@BattleJam";
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {

        }
    }
}
