/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.List;
import model.Students;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class DBConnect {
    public static Connection getConnection() throws SQLException{
        try{
     Connection cons = null;
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     cons = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=STDS;user=sa;password=123456;encrypt=false");
     return cons;
    }
        catch (ClassNotFoundException ex){
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE,null,ex);
            }
       return null;
    }
    
public static void main(String[] args) {
    try {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    } catch (SQLException ex) {
        Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}
