package lv.battlejam.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class ConnectionController {

    private static Connection conn = null;
    
    
    @Autowired
    public ConnectionController(DataSource dataSource){
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Connection getDataSource() {

        return conn;
    }

    public static void init(){
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://91.105.87.91:3306/battle_jam";
        String USER = "dbcon";
        String PASS = "@BattleJam";
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   
}
