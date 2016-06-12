/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class dbconnect {
    Connection con;Statement st;
    public dbconnect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gamebox","root","root");
            st=con.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dbconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ResultSet getSelect(String q) throws SQLException
    {
        ResultSet rs=st.executeQuery(q);
        return rs;
    }
    public int getInsert(String q) throws SQLException
    {
        int i=st.executeUpdate(q);
        return i;
    }
}
