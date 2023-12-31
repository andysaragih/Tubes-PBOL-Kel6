/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubespbol6;

/**
 *
 * @author User
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class EditTugas extends javax.swing.JFrame {

    /**
     * Creates new form EditTugas
     */
    public Statement st;
    public ResultSet rs;
    Connection cn = Koneksi.Koneksi();
    
    private String namaTugas;

    public EditTugas() {
        initComponents();
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        
        int x = screen.width /2 - this.getSize().width / 2;
        int y = screen.height /2 - this.getSize().height / 2;
        this.setLocation(x, y);
    }
    
    public EditTugas(String namaTugas) {
        this.namaTugas = namaTugas;
        initComponents();
        tampilData();
    
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        
        int x = screen.width /2 - this.getSize().width / 2;
        int y = screen.height /2 - this.getSize().height / 2;
        this.setLocation(x, y);
    }

    private void tampilData(){
        try {
        String sql = "SELECT * FROM penjadwalan WHERE nama_tugas = '" + namaTugas + "' ";
        
        st = cn.createStatement();
        rs = st.executeQuery(sql);

        // Pastikan bahwa rs.next() benar-benar ada data sebelum mencoba mengambil nilainya
        if (rs.next()) {
            // Ambil nilai dari hasil query
            String tugas = rs.getString("nama_tugas");
            String deskripsi = rs.getString("deskripsi");
            String dueDate = rs.getString("due_date");
            
            Date tenggat = rs.getTimestamp("due_date");

            // Setel nilai-nilai tersebut pada label-label
            txtTugas.setText(tugas);
            txtDeskripsi.setText(deskripsi);
            txtTenggat.setDate(tenggat);
        } else {
            // Tidak ada data yang cocok dengan kriteria, mungkin tampilkan pesan atau lakukan sesuatu yang sesuai
            System.out.println("Tidak ada data dengan nama tugas '" + namaTugas + "'");
        }
    } catch (SQLException e) {
            // Handle exception (e.g., tampilkan pesan kesalahan atau log)
            JOptionPane.showMessageDialog(this, e.getMessage());
            
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        txtTugas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        btnKembali = new javax.swing.JButton();
        lblNamaTugas = new javax.swing.JLabel();
        lblNamaTugas1 = new javax.swing.JLabel();
        lblNamaTugas2 = new javax.swing.JLabel();
        txtTenggat = new com.toedter.calendar.JDateChooser();

        jLabel3.setFont(new java.awt.Font("Raleway ExtraBold", 0, 14)); // NOI18N
        jLabel3.setText("PETUGAS");

        jPanel1.setBackground(new java.awt.Color(178, 200, 186));

        jLabel4.setFont(new java.awt.Font("Raleway ExtraBold", 0, 14)); // NOI18N
        jLabel4.setText("PETUGAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jTextField1.setText("Nama_tugas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(249, 181, 114));

        jPanel3.setBackground(new java.awt.Color(116, 142, 99));

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TASUKU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSimpan.setBackground(new java.awt.Color(116, 142, 99));
        btnSimpan.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtTugas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTugasActionPerformed(evt);
            }
        });

        txtDeskripsi.setColumns(20);
        txtDeskripsi.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDeskripsi.setRows(5);
        txtDeskripsi.setText("deskripsi_tugas");
        jScrollPane1.setViewportView(txtDeskripsi);

        btnKembali.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        lblNamaTugas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNamaTugas.setText("Nama Tugas");

        lblNamaTugas1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNamaTugas1.setText("Deskripsi");

        lblNamaTugas2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblNamaTugas2.setText("Tenggat");

        txtTenggat.setDateFormatString(" yyyy-MM-dd HH:mm:ss");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNamaTugas)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTugas)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                        .addComponent(lblNamaTugas1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblNamaTugas2)
                            .addGap(18, 18, 18)
                            .addComponent(txtTenggat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblNamaTugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblNamaTugas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamaTugas2)
                    .addComponent(txtTenggat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTugasActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        DeskripsiTugas desc = new DeskripsiTugas(txtTugas.getText());
            
            desc.setVisible(true);
            
            this.setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
         try {
            // aksi simpan data
            if (btnSimpan.getText() == "Simpan"){
                    
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Sesuaikan dengan format tanggal di database
                String formattedDate = sdf.format(txtTenggat.getDate());
                
                String sql = "UPDATE penjadwalan SET nama_tugas = '" + txtTugas.getText() + "', deskripsi = '" + txtDeskripsi.getText() + "', due_date = '" + formattedDate + "' WHERE nama_tugas = '" + namaTugas + "'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Tugas berhasil diubah");
                
                this.setVisible(false);
                new Dashboard().setVisible(true);
                
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNamaTugas;
    private javax.swing.JLabel lblNamaTugas1;
    private javax.swing.JLabel lblNamaTugas2;
    private javax.swing.JTextArea txtDeskripsi;
    private com.toedter.calendar.JDateChooser txtTenggat;
    private javax.swing.JTextField txtTugas;
    // End of variables declaration//GEN-END:variables
}
