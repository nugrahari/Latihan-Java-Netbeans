import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.conek;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YUDHA_P
 */
public final class DataMahasiswa extends javax.swing.JInternalFrame {

    /**
     * Creates new form DataMahasiswa
     */
    public DataMahasiswa() {
        initComponents();
      datatable();
    }
public void datatable(){
    
    DefaultTableModel tbl=new DefaultTableModel();
    tbl.addColumn("NPM");
    tbl.addColumn("NAMA");
    tbl.addColumn("Jurusan");
    tbl.addColumn("Jenis Kelamin");
    tbl.addColumn("Alamat");
    table.setModel(tbl);
    try{
        Statement statement=(Statement)conek.GetConnection().createStatement();
        ResultSet res=statement.executeQuery("select * from tabmahasiswa");
        while(res.next())
        {
            tbl.addRow(new Object[]{
                res.getString("npm"),
                res.getString("nama"),
                res.getString("jurusan"),
                res.getString("jeniskelamin"),
                res.getString("alamat")
            });
            table.setModel(tbl);
        }
    }catch (Exception e){
        
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

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnpm = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        cmbjur = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btambah = new javax.swing.JButton();
        bsimpan = new javax.swing.JButton();
        bcari = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setTitle("Data Mahasiswa");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("NPM");

        jLabel3.setText("Nama Mahasiswa");

        jLabel4.setText("Jurusan");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Alamat");

        txtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnpmActionPerformed(evt);
            }
        });

        cmbjur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistem Informasi", "Managemen", "Kom.Akuntansi", "Akuntansi" }));
        cmbjur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbjurActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Laki-Laki");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Perempuan");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btambah.setText("Tambah");
        btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btambahActionPerformed(evt);
            }
        });

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btambah))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtalamat)
                                        .addComponent(txtnpm)
                                        .addComponent(txtnama)
                                        .addComponent(cmbjur, 0, 273, Short.MAX_VALUE)
                                        .addComponent(jRadioButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bsimpan)
                                .addGap(18, 18, 18)
                                .addComponent(bcari)
                                .addGap(18, 18, 18)
                                .addComponent(bhapus)
                                .addGap(18, 18, 18)
                                .addComponent(bkeluar)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbjur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btambah)
                    .addComponent(bsimpan)
                    .addComponent(bcari)
                    .addComponent(bhapus)
                    .addComponent(bkeluar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbjurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbjurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbjurActionPerformed

    private void btambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btambahActionPerformed
        txtnpm.setText("");
        txtnama.setText("");
        cmbjur.setSelectedItem("");
        if (jRadioButton1.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "laki-laki");
        } else if(jRadioButton2.isSelected()){
            JOptionPane.showMessageDialog(rootPane, "perempuan");
            txtalamat.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btambahActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String npm = txtnpm.getText();
        String nama = txtnama.getText();
        String jurusan = (String) cmbjur.getSelectedItem();
        String alamat = txtalamat.getText();
        String jeniskelamin = null;
        
        if (jRadioButton1.isSelected()){
            jeniskelamin="laki-laki";
        } else if (jRadioButton2.isSelected()){
            jeniskelamin="perempuan";
        
        }
        try {
            try (Statement statement = (Statement) conek.GetConnection().createStatement()) {
                statement.executeUpdate("insert into tabmahasiswa VALUES ('"+npm+"','"+nama+"','"+jurusan+"','"+jeniskelamin+"','"+alamat+"');");
            }
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
           } catch (SQLException | HeadlessException e) {
               JOptionPane.showMessageDialog(null,"data gagal disimpan");
           }
        datatable();
        // TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        try {
            Statement statement = (Statement) conek.GetConnection().createStatement();
            ResultSet res=statement.executeQuery("select * from tabmahasiswa where"+"npm='"+txtnpm.getText()+"'");
        DefaultTableModel tbl=new DefaultTableModel();    
        tbl.addColumn("NPM");
        tbl.addColumn("NAMA");
        tbl.addColumn("Jurusan");
        
        table.setModel(tbl);
        while (res.next()){
            tbl.addRow(new Object[]{
                res.getString("npm"),
                res.getString("nama"),
                res.getString("jurusan")               
        });
            table.setModel(tbl);
        }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "salah");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bcariActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        String npm=txtnpm.getText();
        try { 
            Statement statement=(Statement) conek.GetConnection().createStatement();
            statement.executeUpdate("DELETE from tabmahasiswa where npm=('"+npm+"');");
            JOptionPane.showMessageDialog(null,"data berhasil di HAPUS");
            txtnpm.setText("");
            txtnama.setText("");
            cmbjur.setSelectedItem("");
            String jeniskelamin=null;
            txtalamat.setText("");
            txtnpm.requestFocus();
        } catch (SQLException | HeadlessException t) {
            JOptionPane.showMessageDialog(null, "Data GAGAL di HAPUSS");
            
        }
        datatable();
        // TODO add your handling code here:
    }//GEN-LAST:event_bhapusActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_bkeluarActionPerformed

    private void txtnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpmActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbjur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnpm;
    // End of variables declaration//GEN-END:variables
}
