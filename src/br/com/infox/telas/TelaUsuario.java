/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Fellipe
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaUsuario() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuNome = new javax.swing.JTextField();
        txtUsuID = new javax.swing.JTextField();
        txtUsuFone = new javax.swing.JTextField();
        txtUsuSenha = new javax.swing.JTextField();
        txtUsuLogin = new javax.swing.JTextField();
        cmbUsuPerfil = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        brnConsult = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menConsult = new javax.swing.JMenu();
        menSave = new javax.swing.JMenu();
        menEdit = new javax.swing.JMenu();
        menExclu = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Fone:");

        jLabel4.setText("Login");

        jLabel5.setText("Senha:");

        jLabel6.setText("Perfil:");

        cmbUsuPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/saveicon.png"))); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setToolTipText("Salvar Registro");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/cancel.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Excluir registro");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/pencil (1).png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setToolTipText("Editar Cadastro Usuário");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        brnConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/magnifying-glass.png"))); // NOI18N
        brnConsult.setText("Consultar");
        brnConsult.setToolTipText("Pesquisar Usuário");
        brnConsult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnConsultActionPerformed(evt);
            }
        });

        menConsult.setText("Consultar");
        jMenuBar1.add(menConsult);

        menSave.setText("Salvar");
        menSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSaveActionPerformed(evt);
            }
        });
        jMenuBar1.add(menSave);

        menEdit.setText("Editar");
        menEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menEditActionPerformed(evt);
            }
        });
        jMenuBar1.add(menEdit);

        menExclu.setText("Excluir");
        menExclu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menExclu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menExcluActionPerformed(evt);
            }
        });
        jMenuBar1.add(menExclu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbUsuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtUsuLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                                .addComponent(txtUsuFone))
                                            .addComponent(txtUsuID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbUsuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit)
                    .addComponent(brnConsult))
                .addGap(28, 28, 28))
        );

        setBounds(0, 0, 611, 315);
    }// </editor-fold>//GEN-END:initComponents

    private void menSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menSaveActionPerformed

    private void menEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menEditActionPerformed

    private void menExcluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menExcluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menExcluActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void selectUser() throws SQLException{
        String select = "select * from tbusers where id = ?";
        
        try {
            pst = conexao.prepareStatement(select);
            pst.setString(1, txtUsuID.getText().substring(1, 2));      

            rs = pst.executeQuery();
            
        } catch(SQLException e){
            System.out.println(e);
        }        
       
    }
    
    private void brnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnConsultActionPerformed
        
        try {
            selectUser();
        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_brnConsultActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnConsult;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbUsuPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menConsult;
    private javax.swing.JMenu menEdit;
    private javax.swing.JMenu menExclu;
    private javax.swing.JMenu menSave;
    private javax.swing.JTextField txtUsuFone;
    private javax.swing.JTextField txtUsuID;
    private javax.swing.JTextField txtUsuLogin;
    private javax.swing.JTextField txtUsuNome;
    private javax.swing.JTextField txtUsuSenha;
    // End of variables declaration//GEN-END:variables
}
