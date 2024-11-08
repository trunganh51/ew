/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trantrunganh_dhti16a2hn_081124;

import java.sql.*;
/**
 *
 * @author Tranh
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class KN {

    public static Connection KNDL() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/qlgv", "root", "");
            return c;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
