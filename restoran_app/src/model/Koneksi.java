    package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    static Connection conn;

    public static Connection ConnectDB() {
        try {
            // Load driver JDBC versi lama
            Class.forName("com.mysql.jdbc.Driver");
            
            // Koneksi ke database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran_app", "root", "");
            
            // Tampilkan pesan jika koneksi berhasil
            return conn;
        } catch (ClassNotFoundException e) {
            // Jika driver tidak ditemukan
            System.err.println("Driver JDBC tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            // Jika koneksi gagal
            System.err.println("Koneksi ke database gagal: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
        return null;
    }

    public static void putusKoneksi() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Koneksi Terputus!");
            }
        } catch (SQLException e) {
            System.err.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }
}
