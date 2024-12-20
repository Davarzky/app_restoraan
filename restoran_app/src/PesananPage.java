
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Koneksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hurricane
 */
public class PesananPage1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesananPage
     */
    public PesananPage1() {
        initComponents();
        loadMeja();
        generateIdPesanan();
        
        
        
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TidPesanan = new javax.swing.JTextField();
        Tpelanggan = new javax.swing.JTextField();
        TnamaPelanggan = new javax.swing.JTextField();
        CnamaMeja = new javax.swing.JComboBox<>();
        TidMenu = new javax.swing.JTextField();
        TnamaMenu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Btambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtambahMenu = new javax.swing.JButton();
        Tharga = new javax.swing.JTextField();
        Tjumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TidUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        Tpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpelangganActionPerformed(evt);
            }
        });

        CnamaMeja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TidMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidMenuActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Menu", "Harga", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(table);

        Btambah.setText("Tambah Pesanan");
        Btambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtambahMouseClicked(evt);
            }
        });

        jLabel1.setText("ID Pesanan");

        jLabel2.setText("ID Pelanggan");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("Nama Meja");

        jLabel5.setText("ID Menu");

        jLabel6.setText("Nama Menu");

        BtambahMenu.setText("+");
        BtambahMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtambahMenuMouseClicked(evt);
            }
        });

        jLabel7.setText("Harga");

        jLabel8.setText("Jumlah");

        jLabel9.setText("ID User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(Btambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TidPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(TidMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(TnamaMenu))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addComponent(Tpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addComponent(jLabel2)
                                                                    .addGap(75, 75, 75)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(TnamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6))))
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(Tharga)
                                                        .addComponent(CnamaMeja, 0, 136, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(Tjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtambahMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TidPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TnamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CnamaMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TidMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TnamaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tharga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtambahMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(Tjumlah))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TidUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
        TidPesanan.setText(generateIdPesanan());
    TidPesanan.setEnabled(false);

    }
    private String generateIdPesanan() {
    String lastId = null;
    String newId = null;
    Connection konek = Koneksi.ConnectDB();

    String query = "SELECT id_pesanan FROM pesanan ORDER BY id_pesanan DESC LIMIT 1";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            lastId = rs.getString("id_pesanan");
            int idNumber = Integer.parseInt(lastId.split("-")[1]);
            idNumber++;
            newId = String.format("PX-%03d", idNumber);
        } else {
            newId = "PX-001"; 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    return newId;
}
    private void TpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpelangganActionPerformed
        // TODO add your handling code here:
         String pelangganId = Tpelanggan.getText();

    try (Connection DB = Koneksi.ConnectDB()) {
        String query = "SELECT * FROM pelanggan WHERE id_pelanggan = ?";
        PreparedStatement statement = DB.prepareStatement(query);
        statement.setString(1, pelangganId);
        
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            TnamaPelanggan.setText(result.getString("nama_pelanggan"));
            
        } else {
            JOptionPane.showMessageDialog(this, "Pelanggan tidak ditemukan");
            TnamaPelanggan.setText("");
            
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_TpelangganActionPerformed

    private void TidMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidMenuActionPerformed
        // TODO add your handling code here:
        String barangId = TidMenu.getText();

    try (Connection DB = Koneksi.ConnectDB()) {
        String query = "SELECT * FROM menu WHERE id_menu = ?";
        PreparedStatement statement = DB.prepareStatement(query);
        statement.setString(1, barangId);
        
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            TnamaMenu.setText(result.getString("nama_menu"));
            Tharga.setText(result.getString("harga"));
        } else {
            JOptionPane.showMessageDialog(this, "Barang tidak ditemukan");
            TnamaMenu.setText("");
            Tharga.setText("");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_TidMenuActionPerformed
private String getIdMenu(String namaMenu) {
    String idMenu = null;  
    String query = "SELECT id_menu FROM menu WHERE nama_menu = ?";  
    
    try (Connection konek = Koneksi.ConnectDB()) { 
        PreparedStatement pst = konek.prepareStatement(query);  
        pst.setString(1, namaMenu);  
        
        ResultSet rs = pst.executeQuery();  
        
        if (rs.next()) {  
            idMenu = rs.getString("id_menu");  
        }
    } catch (SQLException e) {  
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());  
    }
    
    return idMenu; 
}

    
    private void BtambahMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtambahMenuMouseClicked
        // TODO add your handling code here:
      String namaMenu = TnamaMenu.getText();
    int harga = Integer.parseInt(Tharga.getText());
    int jumlah = Integer.parseInt(Tjumlah.getText());

    DefaultTableModel model = (DefaultTableModel) table.getModel();
    
    model.addRow(new Object[]{namaMenu, harga, jumlah});

    TidMenu.setText("");
    TnamaMenu.setText("");
    Tharga.setText("");
    Tjumlah.setText("");
    }//GEN-LAST:event_BtambahMenuMouseClicked

    private void BtambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtambahMouseClicked
        // TODO add your handling code here:
         String pelangganId = Tpelanggan.getText();
    String mejaName = (String) CnamaMeja.getSelectedItem();  
    String idMeja = getIdMeja(mejaName);  
    
    if (idMeja == null) {
        JOptionPane.showMessageDialog(this, "Meja tidak ditemukan");
        return;
    }

    String idPesanan = TidPesanan.getText();

    DefaultTableModel model = (DefaultTableModel) table.getModel();
    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Tidak ada menu yang dipilih.");
        return;
    }

    String queryPesanan = "INSERT INTO pesanan (id_pesanan, id_pelanggan, id_meja, id_user) VALUES (?, ?, ?, ?)";
    try (Connection konek = Koneksi.ConnectDB()) {
        PreparedStatement pstPesanan = konek.prepareStatement(queryPesanan);
        pstPesanan.setString(1, idPesanan);  
        pstPesanan.setString(2, pelangganId);  
        pstPesanan.setString(3, idMeja); 
        pstPesanan.setString(4, TidUser.getText()); 
        
        int resultPesanan = pstPesanan.executeUpdate();
        
        if (resultPesanan > 0) {
            String queryDetail = "INSERT INTO pesanan_detail (id_pesanan, id_menu, jumlah) VALUES (?, ?, ?)";
            PreparedStatement pstDetail = konek.prepareStatement(queryDetail);
            
            for (int i = 0; i < model.getRowCount(); i++) {
                String namaMenu = (String) model.getValueAt(i, 0);  
                int jumlah = (int) model.getValueAt(i, 2);  
                
                String idMenu = getIdMenu(namaMenu);  
                
                if (idMenu != null) {
                    pstDetail.setString(1, idPesanan);  
                    pstDetail.setString(2, idMenu); 
                    pstDetail.setInt(3, jumlah);  
                    
                    pstDetail.addBatch(); 
                }
            }
            
            int[] resultDetail = pstDetail.executeBatch();  
            
            if (resultDetail.length > 0) {
                JOptionPane.showMessageDialog(this, "Pesanan berhasil disimpan!");
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan detail pesanan.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan pesanan.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    TidPesanan.setText("");  
    Tpelanggan.setText("");  
    CnamaMeja.setSelectedIndex(0); 
    model.setRowCount(0);  
    }//GEN-LAST:event_BtambahMouseClicked
    
    
  private void loadMeja() {
    Connection konek = Koneksi.ConnectDB();
    String query = "SELECT id_meja, nama_meja FROM meja"; 
    try {
        PreparedStatement pst = konek.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        CnamaMeja.removeAllItems(); 
        while (rs.next()) {
            CnamaMeja.addItem(rs.getString("nama_meja")); 
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}

  private String getIdMeja(String mejaName) {
    String idMeja = null;
    try (Connection konek = Koneksi.ConnectDB()) {
        String query = "SELECT id_meja FROM meja WHERE nama_meja = ?";
        PreparedStatement pst = konek.prepareStatement(query);
        pst.setString(1, mejaName);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            idMeja = rs.getString("id_meja");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    return idMeja;
}

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btambah;
    private javax.swing.JButton BtambahMenu;
    private javax.swing.JComboBox<String> CnamaMeja;
    private javax.swing.JTextField Tharga;
    private javax.swing.JTextField TidMenu;
    private javax.swing.JTextField TidPesanan;
    private javax.swing.JTextField TidUser;
    private javax.swing.JTextField Tjumlah;
    private javax.swing.JTextField TnamaMenu;
    private javax.swing.JTextField TnamaPelanggan;
    private javax.swing.JTextField Tpelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
