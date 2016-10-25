/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Israel
 */
public class FirstConnection {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select * from personas");

            while (rs.next()) {
                System.out.println("id:  " + rs.getInt(1));
                System.out.println("Nombre  " + rs.getString(2));
                System.out.println("correo:  " + rs.getString(3));
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("class not foud exception");
        } catch (InstantiationException ex) {
            System.out.println("Instantion exception");
        } catch (IllegalAccessException ex) {
            System.out.println("IlegakAccessException");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

}
