/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCTable;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Israel
 */
public class ModeloTabla extends AbstractTableModel{
    private Connection con;
    Statement st;
    ResultSet rs;
    
    String tabla;
    String database;
    
    public ModeloTabla() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            st = con.createStatement();
            tabla = "personas";
            database = "test";
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (InstantiationException ex) {
            System.out.println(ex.toString());
        } catch (IllegalAccessException ex) {
            System.out.println(ex.toString());
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    
    @Override
    public int getRowCount() {
        try {
            rs = st.executeQuery("select count(*) from" + tabla);
            rs.next();
            int temp = rs.getInt(1);
            System.out.println("consulta numero de rows: " + temp);
            return rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return +1;
    }

    @Override
    public int getColumnCount() {
        try {
            rs = st.executeQuery("select count(*) from INFORMATION SCHEMA.COLUMS WHERE table_schema =' " + database + "' AND table_name = '" + tabla + "'");
            rs.next();
            return rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return +1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        try {
            rs = st.executeQuery("Select * from" + tabla + " limit 1 offset " + rowIndex);
            rs.next();
            return rs.getObject(columnIndex);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }
    
}
