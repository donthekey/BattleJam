package lv.battlejam.dbmanagment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lv.battlejam.controllers.ConnectionController;


public class AccountManagment {
    
    public static boolean login(String username,String password){
        try {
            Statement st = ConnectionController.getDataSource().createStatement();
           
            ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE account_name = '" + username + "' AND account_password = '" + password + "'");
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Cannot find such account! ");
        }
        return false;
    }
    
    
    
    
}
