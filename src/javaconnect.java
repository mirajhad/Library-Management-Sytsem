/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIRAJ
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
 Connection conn;
 public static Connection ConnecrDb(){
     try{
        Class.forName("org.sqlite.JDBC");
        Connection conn;
         conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MIRAJ\\Documents\\NetBeansProjects\\Library_Management_System-master\\library.sqlite");
        return conn;
     }catch(ClassNotFoundException | SQLException e){
         JOptionPane.showMessageDialog(null, e);
         return null;
     }
 }
}
