package Tes_Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Latihan_2 {
    static final String DB_Url = "jdbc:mysql://localhost:3306/db_Unidha3";
    
    private static Connection Tes_Konek;
    public static Connection DB_Konek () throws SQLException,ClassNotFoundException {
        try {
            Driver myDriver =new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println("Proses Deteksi Driver Berhasil");
            
            final java.sql.Connection tersambung = DriverManager.getConnection(DB_Url,"root","");
            System.out.println("Koneksi Database Berhasil");
            
        } catch (final SQLException ex) {
            System.out.println ("Koneksi Database Gagal") ;
            
        } 
        Connection Test_Konek = null;
    return Test_Konek;
    }
}