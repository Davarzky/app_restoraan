
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Koneksi;
import model.MMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hurricane
 */
public class MenuPage extends javax.swing.JInternalFrame {
List<MMenu> menuList = new ArrayList<>();
    /**
     * Creates new form BarangPage
     */
    public MenuPage() {
        initComponents();
        TampilkanData();
        
        
        
        
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        Tharga = new javax.swing.JTextField();
        Btambah = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Menu", "Nama Menu", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Menu Page");

        Tharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThargaActionPerformed(evt);
            }
        });

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

        Bdelete.setText("Delete");
        Bdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BdeleteMouseClicked(evt);
            }
        });

        jLabel2.setText("ID Menu");

        jLabel3.setText("Nama Menu");

        jLabel4.setText("Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Tharga, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tharga, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(Tid)
                    .addComponent(Tnama))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(Btambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThargaActionPerformed
    private String generateIdMenu() {
    String lastId = null;
    String newId = null;
    Connection konek = Koneksi.ConnectDB();

    String query = "SELECT id_menu FROM menu ORDER BY id_menu DESC LIMIT 1";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            lastId = rs.getString("id_menu");
            int idNumber = Integer.parseInt(lastId.split("-")[1]);
            idNumber++;
            newId = String.format("MN-%03d", idNumber);
        } else {
            newId = "MN-001"; 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    return newId;
}

    private void BtambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtambahMouseClicked
        String idMenu = generateIdMenu();
    String namaMenu = Tnama.getText();
    String hargaStr = Tharga.getText();

    if (namaMenu.isEmpty() || hargaStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap isi semua kolom!");
        return;
    }

    int harga;
    try {
        harga = Integer.parseInt(hargaStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
        return;
    }

    String query = "INSERT INTO menu (id_menu, nama_menu, harga) VALUES (?, ?, ?)";
    try (Connection konek = Koneksi.ConnectDB(); 
         PreparedStatement pst = konek.prepareStatement(query)) {
        pst.setString(1, idMenu);  
        pst.setString(2, namaMenu);
        pst.setInt(3, harga);
        
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{idMenu, namaMenu, harga});
            JOptionPane.showMessageDialog(this, "Menu berhasil ditambahkan!");

            Tid.setText(generateIdMenu()); 
            Tnama.setText("");
            Tharga.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
   
    }//GEN-LAST:event_BtambahMouseClicked

    private void BupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BupdateMouseClicked
        int selectedRow = table.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin diubah!");
        return;
    }
    
    String idMenu = Tid.getText();
    String namaMenu = Tnama.getText();
    String hargaStr = Tharga.getText();

    if (idMenu.isEmpty() || namaMenu.isEmpty() || hargaStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap isi semua kolom!");
        return;
    }

    int harga;
    try {
        harga = Integer.parseInt(hargaStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
        return;
    }

    String query = "UPDATE menu SET nama_menu = ?, harga = ? WHERE id_menu = ?";
    try (Connection konek = Koneksi.ConnectDB(); 
         PreparedStatement pst = konek.prepareStatement(query)) {
        pst.setString(1, namaMenu);
        pst.setInt(2, harga);
        pst.setString(3, idMenu);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setValueAt(namaMenu, selectedRow, 1);
            model.setValueAt(harga, selectedRow, 2);

            JOptionPane.showMessageDialog(this, "Menu berhasil diperbarui!");
            TampilkanData();
            Tnama.setText("");
            Tharga.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }

    
    }//GEN-LAST:event_BupdateMouseClicked

    private void BdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdeleteMouseClicked
        // TODO add your handling code here:
          int selectedRow = table.getSelectedRow();
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
        return;
    }

    String idMenu = (String) table.getValueAt(selectedRow, 0);
    
    String query = "DELETE FROM menu WHERE id_menu = ?";
    try (Connection konek = Koneksi.ConnectDB(); 
         PreparedStatement pst = konek.prepareStatement(query)) {
        pst.setString(1, idMenu);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Menu berhasil dihapus!");
            Tnama.setText("");
            Tharga.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    
    }//GEN-LAST:event_BdeleteMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
         int selectedRow = table.getSelectedRow();
    if (selectedRow != -1) {
        String idMenu = (String) table.getValueAt(selectedRow, 0);
        String namaMenu = (String) table.getValueAt(selectedRow, 1);
        String hargaStr = String.valueOf(table.getValueAt(selectedRow, 2));

        Tid.setText(idMenu);
        Tnama.setText(namaMenu);
        Tharga.setText(hargaStr);

        Bupdate.setEnabled(true);
        Bdelete.setEnabled(true);
    }
    }//GEN-LAST:event_tableMouseClicked
   private void TampilkanData() {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);

    String query = "SELECT id_menu, nama_menu, harga FROM menu";
    Connection konek = Koneksi.ConnectDB();

    try {
        Statement stmt = konek.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String idMenu = rs.getString("id_menu");
            String namaMenu = rs.getString("nama_menu");
            int harga = rs.getInt("harga");

            model.addRow(new Object[]{idMenu, namaMenu, harga});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (konek != null) konek.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
        Tid.setText(generateIdMenu());
    Tid.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Btambah;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Tharga;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tnama;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
