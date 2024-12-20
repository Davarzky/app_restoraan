
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Koneksi;
import model.MMeja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hurricane
 */
public class MejaPage extends javax.swing.JInternalFrame {
List<MMeja> mejaList = new ArrayList<>();
    /**
     * Creates new form MejaPage
     */
    public MejaPage() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Tid = new javax.swing.JTextField();
        Tnama = new javax.swing.JTextField();
        RBT = new javax.swing.JRadioButton();
        RBB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btambah = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();

        buttonGroup1.add(RBT);
        RBT.setText("Tersedia");

        buttonGroup1.add(RBB);
        RBB.setText("Belum Tersedia");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Meja", "Nama Meja", "Kondisi"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("ID Meja");

        jLabel2.setText("Nama Meja");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(RBT)
                                    .addGap(18, 18, 18)
                                    .addComponent(RBB))))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RBT)
                        .addComponent(RBB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Bdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(Btambah, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(Bupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private String generateIdMeja() {
    String lastId = null;
    String newId = null;
    Connection konek = Koneksi.ConnectDB(); 

    String query = "SELECT id_meja FROM meja ORDER BY id_meja DESC LIMIT 1";

    try {
        PreparedStatement pst = konek.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            lastId = rs.getString("id_meja");
            int idNumber = Integer.parseInt(lastId.split("-")[1]);
            idNumber++;
            newId = String.format("MJ-%03d", idNumber);
        } else {
            newId = "MJ-001"; 
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }

    return newId;
}

    private void BtambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtambahMouseClicked
         String namaMeja = Tnama.getText();
        String status = "";
        
        
        if (RBT.isSelected()) {
        status = "Tersedia";
    } else if (RBB.isSelected()) {
        status = "Belum Tersedia";
    } else {
        JOptionPane.showMessageDialog(this, "Pilih kondisi meja!");
        return;
    }

        if (namaMeja.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama meja tidak boleh kosong!");
            return;
        }

        String idMeja = generateIdMeja();

        try {
            Connection konek = Koneksi.ConnectDB();
            String query = "INSERT INTO meja (id_meja, nama_meja, status) VALUES (?, ?, ?)";
            PreparedStatement pst = konek.prepareStatement(query);
            pst.setString(1, idMeja);
            pst.setString(2, namaMeja);
            pst.setString(3, status);
            pst.executeUpdate();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{idMeja, namaMeja, status});
            
            

            JOptionPane.showMessageDialog(this, "Meja berhasil ditambahkan!");
            clearForm();

            Tid.setText(generateIdMeja());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_BtambahMouseClicked

    private void BupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BupdateMouseClicked
        // TODO add your handling code here:
     String idMeja = Tid.getText();
        String namaMeja = Tnama.getText();
          String status = "";
        
        if (RBT.isSelected()) {
        status = "Tersedia";
    } else if (RBB.isSelected()) {
        status = "Belum Tersedia";
    } else {
        JOptionPane.showMessageDialog(this, "Pilih kondisi meja!");
        return;
    }

        if (namaMeja.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama meja tidak boleh kosong!");
            return;
        }

        try {
            Connection konek = Koneksi.ConnectDB();
            String query = "UPDATE meja SET nama_meja = ?, status = ? WHERE id_meja = ?";
            PreparedStatement pst = konek.prepareStatement(query);
            pst.setString(1, namaMeja);
            pst.setString(2, status);
            pst.setString(3, idMeja);
            pst.executeUpdate();

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int selectedRow = table.getSelectedRow();
            model.setValueAt(namaMeja, selectedRow, 1);
            model.setValueAt(status, selectedRow, 2);

            Btambah.setEnabled(true);
            Bupdate.setEnabled(false);
            Bdelete.setEnabled(false);

            JOptionPane.showMessageDialog(this, "Meja berhasil diperbarui!");
            clearForm();
            TampilkanData();
            Tid.setText(generateIdMeja());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BupdateMouseClicked

    private void BdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdeleteMouseClicked
        // TODO add your handling code here:
        String idMeja = Tid.getText();

        if (idMeja.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih meja yang akan dihapus!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus meja ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection konek = Koneksi.ConnectDB();
                String query = "DELETE FROM meja WHERE id_meja = ?";
                PreparedStatement pst = konek.prepareStatement(query);
                pst.setString(1, idMeja);
                pst.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(table.getSelectedRow());

                clearForm();
                Btambah.setEnabled(true);
                Bupdate.setEnabled(false);
                Bdelete.setEnabled(false);

                JOptionPane.showMessageDialog(this, "Meja berhasil dihapus!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_BdeleteMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow(); 
    if (selectedRow != -1) {
        String idMeja = table.getValueAt(selectedRow, 0).toString();
        String namaMeja = table.getValueAt(selectedRow, 1).toString();
        String status = table.getValueAt(selectedRow, 2).toString();

        Tid.setText(idMeja);
        Tnama.setText(namaMeja);
        
        if (status.equals("Tersedia")) {
            RBT.setSelected(true);
        } else {
            RBB.setSelected(true);
        }

        Btambah.setEnabled(false);
        Bupdate.setEnabled(true);
        Bdelete.setEnabled(true);
    }
        
    }//GEN-LAST:event_tableMouseClicked
    private void TampilkanData() {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); 

    String query = "SELECT id_meja, nama_meja, status FROM meja";  
    Connection konek = Koneksi.ConnectDB();  

    try {
        Statement stmt = konek.createStatement();
        ResultSet rs = stmt.executeQuery(query);  

        while (rs.next()) {
            String idMeja = rs.getString("id_meja");  
            String namaMeja = rs.getString("nama_meja");  
            String status = rs.getString("status");  

            model.addRow(new Object[]{idMeja, namaMeja, status});  
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
        Tid.setText(generateIdMeja());
    Tid.setEnabled(false);
    RBT.setSelected(true);
        Btambah.setEnabled(true);

            Bupdate.setEnabled(false);
            Bdelete.setEnabled(false);
    }
     private void clearForm() {
    Tnama.setText("");    
    RBT.setSelected(false); 
    RBB.setSelected(false); 
    Btambah.setEnabled(true);   
    Bupdate.setEnabled(false);  
    Bdelete.setEnabled(false);  
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Btambah;
    private javax.swing.JButton Bupdate;
    private javax.swing.JRadioButton RBB;
    private javax.swing.JRadioButton RBT;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tnama;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
