/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbol6;

/**
 *
 * @author ASUS
 */

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection cn;
    
    public static Connection Koneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/penjadwalan_tugas", "root", "");
            System.out.println("koneksi berhasil");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
