/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hurricane
 */
public class p {
    apakah sudah benar 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Koneksi;
import model.MPelanggan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hurricane
 */
public class PelangganPage extends javax.swing.JInternalFrame {
    List<MPelanggan> pelangganList = new ArrayList<>();
    /**
     * Creates new form PelangganPage
     */
    public PelangganPage() {
        initComponents();
        TampilkanData();
        AmbilData();
        
        
                addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
    public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
        formInternalFrameActivated(evt);
    }
});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        THp = new javax.swing.JTextField();
        Talamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Btambah = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        RBLaki = new javax.swing.JRadioButton();
        RBPerempuan = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PELANGGAN PAGE");

        jLabel2.setText("ID Pelanggan");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("No HP");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Alamat");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pelanggan", "Nama", "No HP", "Jenis Kelamin", "Alamat"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        Btambah.setText("Tambah");
        Btambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtambahMouseClicked(evt);
            }
        });

        Bupdate.setText("Update");
        Bupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BupdateMouseClicked(evt);
            }
        });

        Bdelete.setText("Hapus");
        Bdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BdeleteMouseClicked(evt);
            }
        });

        buttonGroup1.add(RBLaki);
        RBLaki.setText("Laki-laki");

        buttonGroup1.add(RBPerempuan);
        RBPerempuan.setText("Perempuan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(RBLaki))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Talamat)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Tnama))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(THp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(Bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RBPerempuan))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(THp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBLaki))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBPerempuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BtambahMouseClicked(java.awt.event.MouseEvent evt) {                                     
     Tid.setText(generateIdPelanggan()); 
    String nama = Tnama.getText();
    String alamat = Talamat.getText();
    String teleponStr = THp.getText();

    
    String jenisKelamin = "";
    if (RBLaki.isSelected()) {
        jenisKelamin = "L";
    } else if (RBPerempuan.isSelected()) {
        jenisKelamin = "P";
    } else {
        JOptionPane.showMessageDialog(this, "Pilih jenis kelamin!");
        return; 
    }

    if (nama.isEmpty() || alamat.isEmpty() || teleponStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap isi semua kolom!");
        return; 
    }

    if (!teleponStr.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Format nomor telepon salah. Harap masukkan angka.");
        return; // Jika format nomor telepon salah, hentikan proses
    }

    String id = generateIdPelanggan();

    Connection konek = Koneksi.ConnectDB();
    String query = "INSERT INTO pelanggan (id_pelanggan, nama_pelanggan, jenis_kelamin, noHp, alamat) VALUES (?, ?, ?, ?, ?)";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        pst.setString(1, id); // ID pelanggan yang sudah di-generate
        pst.setString(2, nama); // Nama pelanggan
        pst.setString(3, jenisKelamin); // Jenis kelamin pelanggan
        pst.setString(4, teleponStr); // Nomor telepon pelanggan
        pst.setString(5, alamat); // Alamat pelanggan

        int result = pst.executeUpdate();
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");

            // Tambahkan data baru langsung ke tabel
            DefaultTableModel model = (DefaultTableModel) table.getModel(); // Ganti 'table' dengan nama variabel tabel yang sesuai
            model.addRow(new Object[]{id, nama, jenisKelamin, teleponStr, alamat}); // Tambahkan data baru ke tabel

            // Bersihkan form setelah penyimpanan berhasil
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
        
        
    }                                    

    private void BupdateMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        String id = Tid.getText();
    String nama = Tnama.getText();
    String alamat = Talamat.getText();
    String teleponStr = THp.getText();
    String jenisKelamin = "";

    if (RBLaki.isSelected()) {
        jenisKelamin = "L";
    } else if (RBPerempuan.isSelected()) {
        jenisKelamin = "P";
    } else {
        JOptionPane.showMessageDialog(this, "Pilih jenis kelamin!");
        return;
    }

    if (id.isEmpty() || nama.isEmpty() || alamat.isEmpty() || teleponStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap isi semua kolom!");
        return;
    }

    if (!teleponStr.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Format nomor telepon salah. Harap masukkan angka.");
        return;
    }

    int telepon = Integer.parseInt(teleponStr); // Parse the phone number to an integer

    Connection konek = Koneksi.ConnectDB();
    String query = "UPDATE pelanggan SET nama_pelanggan = ?, alamat = ?, noHp = ?, jenis_kelamin = ? WHERE id_pelanggan = ?";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        pst.setString(1, nama);
        pst.setString(2, alamat);
        pst.setInt(3, telepon);
        pst.setString(4, jenisKelamin);
        pst.setString(5, id); // ID pelanggan yang akan diupdate

        int result = pst.executeUpdate();
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
            TampilkanData(); // Call the method to refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Gagal mengupdate data");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }                                    

    private void BdeleteMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        
         int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus terlebih dahulu!");
        return; // Jika tidak ada baris yang dipilih, hentikan proses
    }

    // Ambil ID pelanggan dari baris yang dipilih
    String idPelanggan = (String) table.getValueAt(selectedRow, 0); // Asumsi kolom ID berada di index 0

    // Konfirmasi sebelum menghapus
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data pelanggan dengan ID " + idPelanggan + "?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.NO_OPTION) {
        return; // Jika pengguna memilih tidak, hentikan proses
    }

    // Koneksi ke database
    Connection konek = Koneksi.ConnectDB();
    String query = "DELETE FROM pelanggan WHERE id_pelanggan = ?";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        pst.setString(1, idPelanggan); // Set ID pelanggan untuk query DELETE

        // Eksekusi query untuk menghapus data
        int result = pst.executeUpdate();
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");

            // Hapus baris dari JTable
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow); // Hapus baris dari JTable berdasarkan indeks

            clearForm(); // Kosongkan form setelah penghapusan data

            // Generate ID pelanggan terbaru setelah penghapusan
            Tid.setText(generateIdPelanggan());
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menghapus data");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    }
    }                                    

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {                                   
       int row = table.getSelectedRow(); // Ambil baris yang dipilih
    if (row >= 0) {
        try {
            // Ambil data dari tabel dan tampilkan di text field
            String id_pelanggan = table.getValueAt(row, 0).toString(); // ID ada di kolom pertama
            String nama_pelanggan = table.getValueAt(row, 1).toString(); // Nama ada di kolom kedua
            String alamat = table.getValueAt(row, 2).toString(); // Alamat ada di kolom ketiga
            String telepon = table.getValueAt(row, 3).toString(); // Telepon ada di kolom keempat
            String jenis_kelamin = table.getValueAt(row, 4).toString(); // Jenis kelamin ada di kolom kelima

            // Set nilai text field
            Tid.setText(id_pelanggan);
            Tnama.setText(nama_pelanggan);
            Talamat.setText(alamat);
            THp.setText(telepon);
            
            // Set nilai untuk jenis kelamin menggunakan radio button
            if (jenis_kelamin.equals("Laki-laki")) {
                RBLaki.setSelected(true);  // Rblaki adalah JRadioButton untuk Laki-laki
            } else if (jenis_kelamin.equals("Perempuan")) {
                RBPerempuan.setSelected(true);  // Rbperempuan adalah JRadioButton untuk Perempuan
            }

            // Nonaktifkan tombol tambah, aktifkan tombol simpan dan hapus
            Btambah.setEnabled(false);  // Tombol tambah tidak diaktifkan
            Bupdate.setEnabled(true);   // Tombol simpan diaktifkan
            Bdelete.setEnabled(true);   // Tombol hapus diaktifkan
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Log error untuk debugging
        }
    } else {
        JOptionPane.showMessageDialog(null, "Harap pilih baris terlebih dahulu.", "Tidak Ada Baris yang Dipilih", JOptionPane.WARNING_MESSAGE);
    }

    }                                  
 private String generateIdPelanggan() {
  String lastId = null;
    String newId = null;
    Connection konek = Koneksi.ConnectDB();

    String query = "SELECT id_pelanggan FROM pelanggan ORDER BY id_pelanggan DESC LIMIT 1";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            lastId = rs.getString("id_pelanggan");
            int idNumber = Integer.parseInt(lastId.split("-")[1]);
            idNumber++;
            newId = String.format("P-%03d", idNumber);
        } else {
            newId = "P-001"; 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    return newId;
}
  private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
        Tid.setText(generateIdPelanggan());
    Tid.setEnabled(false);
    RBLaki.setSelected(true);
    }
 public void AmbilData() {
    try (Connection DB = Koneksi.ConnectDB();
         PreparedStatement New = DB.prepareStatement("SELECT * FROM pelanggan");
         ResultSet Hasil = New.executeQuery()) {

        pelangganList.clear(); 

        while (Hasil.next()) {
            pelangganList.add(new MPelanggan(
                    Hasil.getString("id_pelanggan"),      
                    Hasil.getString("nama_pelanggan"),    
                    Hasil.getString("noHp"),             
                    Hasil.getString("jenis_kelamin"),    
                    Hasil.getString("alamat")            
            ));
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        e.printStackTrace();
    }
}
 private void TampilkanData() {
    DefaultTableModel tabel = (DefaultTableModel) this.table.getModel();
    tabel.setRowCount(0); 

    for (MPelanggan pelanggan : pelangganList) {
        Object[] row = new Object[5]; 
        row[0] = pelanggan.getId_pelanggan();
        row[1] = pelanggan.getNama_pelanggan();
        row[2] = pelanggan.getNoHp();
        row[3] = pelanggan.getJenis_kelamin();
        row[4] = pelanggan.getAlamat();
        tabel.addRow(row);
    }

    table.setModel(tabel); 
}

private void clearForm() {
    // Kosongkan semua field teks
    Tid.setText("");
    Tnama.setText("");
    THp.setText("");
    Talamat.setText("");
}
    // Variables declaration - do not modify                     
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Btambah;
    private javax.swing.JButton Bupdate;
    private javax.swing.JRadioButton RBLaki;
    private javax.swing.JRadioButton RBPerempuan;
    private javax.swing.JTextField THp;
    private javax.swing.JTextField Talamat;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tnama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration                   
} data yang sudah ditambahkan tidak muncul dan hanya ada satu data yang baru saja ditambahkan
}