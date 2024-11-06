/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TUGASGUI2;

/**
 *
 * @author Imanium
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InputNilaiGUI extends javax.swing.JFrame {
    DefaultTableModel modelmahasiswa;
    InputDataMHS datamahasiswa;
    /**
     * Creates new form arrayGUI
     */
    public InputNilaiGUI() {
        initComponents();
        datamahasiswa = new InputDataMHS();
        viewDataTabel();
    }
    
    public final void viewDataTabel(){
        String [] namakolom = {"NIM", "Nama", "Alamat", "Matkul", "Nilai Akhir"};
        Object [][] objekmahasiswa = new Object[datamahasiswa.getALL().size()] [5];
        int i = 0;
        for (DataPribadiMHS mhs: datamahasiswa.getALL()) 
        {
            String arrayMahasiswa[] = 
            {
            mhs.getNIM(),
            mhs.getNama(),
            mhs.getAlamat(),
            mhs.getMatkul(),
            String.valueOf(hitungNilaiAkhir())
            };

            objekmahasiswa[i] = arrayMahasiswa;
            i++;
        }
        modelmahasiswa = new DefaultTableModel(objekmahasiswa, namakolom);
        mahasiswaTB.setModel(modelmahasiswa);
 }
     public double hitungNilaiAkhir() {
        try {
            double nilai1 = Double.parseDouble(nilai1TF.getText()) * 0.10;
            double nilai2 = Double.parseDouble(nilai2TF.getText()) * 0.15;
            double nilai3 = Double.parseDouble(nilai3TF.getText()) * 0.25;
            double nilai4 = Double.parseDouble(nilai4TF.getText()) * 0.15;
            double nilai5 = Double.parseDouble(nilai5TF.getText()) * 0.35;
            
            return nilai1 + nilai2 + nilai3 + nilai4 + nilai5;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input nilai harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public void ClearTextField(){
        nimTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        matkulTF.setText("");
        nilai1TF.setText("");
        nilai2TF.setText("");
        nilai3TF.setText("");
        nilai4TF.setText("");
        nilai5TF.setText("");
        nimTF.requestFocus();
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nimTF = new javax.swing.JTextField();
        namaTF = new javax.swing.JTextField();
        alamatTF = new javax.swing.JTextField();
        simpanbt = new javax.swing.JButton();
        hapusbt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mahasiswaTB = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        matkulTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nilai1TF = new javax.swing.JTextField();
        nilai2TF = new javax.swing.JTextField();
        nilai3TF = new javax.swing.JTextField();
        nilai4TF = new javax.swing.JTextField();
        nilai5TF = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        nimTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTFActionPerformed(evt);
            }
        });

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        alamatTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTFActionPerformed(evt);
            }
        });

        simpanbt.setText("Simpan");
        simpanbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanbtActionPerformed(evt);
            }
        });

        hapusbt.setText("Hapus");
        hapusbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtActionPerformed(evt);
            }
        });

        mahasiswaTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"
            }
        ));
        jScrollPane2.setViewportView(mahasiswaTB);

        jLabel4.setText("Mata Kuliah");

        matkulTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matkulTFActionPerformed(evt);
            }
        });

        jLabel5.setText("NILAI 1 10%");

        jLabel6.setText("NILAI 2 15%");

        jLabel7.setText("NILAI 3 25%");

        jLabel8.setText("NILAI 4 15%");

        jLabel9.setText("NILAI 5 35%");

        jLabel10.setText("NILAI AKHIR");

        nilai1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai1TFActionPerformed(evt);
            }
        });

        nilai2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai2TFActionPerformed(evt);
            }
        });

        nilai3TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai3TFActionPerformed(evt);
            }
        });

        nilai4TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai4TFActionPerformed(evt);
            }
        });

        nilai5TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai5TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(simpanbt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusbt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(alamatTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(matkulTF, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(nimTF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nilai1TF)
                            .addComponent(nilai2TF)
                            .addComponent(nilai3TF)
                            .addComponent(nilai4TF)
                            .addComponent(nilai5TF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nilai1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(nilai2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(nilai3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(matkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(nilai4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nilai5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanbt)
                    .addComponent(hapusbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void alamatTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTFActionPerformed

    private void simpanbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanbtActionPerformed
        // TODO add your handling code here:
        datamahasiswa.insertData(
        nimTF.getText(),
        namaTF.getText(),
        alamatTF.getText(),
        matkulTF.getText()
        );
        
        viewDataTabel();
        ClearTextField(); 

    }//GEN-LAST:event_simpanbtActionPerformed

    private void hapusbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtActionPerformed
        // TODO add your handling code here:
        datamahasiswa.deleteData(mahasiswaTB.getSelectedRow()+1);
        viewDataTabel();
    }//GEN-LAST:event_hapusbtActionPerformed

    private void matkulTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkulTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matkulTFActionPerformed

    private void nilai1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai1TFActionPerformed

    private void nilai2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai2TFActionPerformed

    private void nilai3TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai3TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai3TFActionPerformed

    private void nilai4TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai4TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai4TFActionPerformed

    private void nilai5TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai5TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai5TFActionPerformed

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
            java.util.logging.Logger.getLogger(InputNilaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputNilaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputNilaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputNilaiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputNilaiGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTF;
    private javax.swing.JButton hapusbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable mahasiswaTB;
    private javax.swing.JTextField matkulTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField nilai1TF;
    private javax.swing.JTextField nilai2TF;
    private javax.swing.JTextField nilai3TF;
    private javax.swing.JTextField nilai4TF;
    private javax.swing.JTextField nilai5TF;
    private javax.swing.JTextField nimTF;
    private javax.swing.JButton simpanbt;
    // End of variables declaration//GEN-END:variables
}
