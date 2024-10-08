package Tes_Koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Latihan_1 {

    static final String db_unidha3 = "jdbc:mysql://localhost:3306/db_prakoop3_01";
    public static void main(String[]args){
    }
    
    private static Connection Test_Konek;
    public static Connection DB_Konek()throws SQLException, ClassNotFoundException {
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(myDriver);
            System.out.println("Proses Deteksi Driver Berhasil");
            
            final java.sql.Connection tersambung = DriverManager.getConnection (db_unidha3, "root", "");
            System.out.println("Koneksi Database Berhasil");
        } catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
    return Test_Konek;    
    }    
}
