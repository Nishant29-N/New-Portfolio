/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import java.sql.*;
/**
 *
 * @author nisha
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{ 
            Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbms?useSSL=false", "root","12345678");
                return con;
        }
        catch(Exception E){
            return null;
        }
    }
}
