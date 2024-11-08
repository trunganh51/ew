/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trantrunganh_dhti16a2hn_081124;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Tranh
 */
public class TestKN {
    public static void main(String[] args) throws SQLException {
        Connection connect = KN.KNDL();
        if (connect == null) {
            System.out.println("error connection!");
        }else{
            System.out.println("Accomplish connection!");
        }
    }
}
