/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import java.sql.*;
import br.com.infox.dal.ModuloConexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class TelaCadCli extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaCadCli() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cepCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        enderecoCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bairroCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidadeCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estadoCli = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        foneCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        celCli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailCli = new javax.swing.JTextField();
        brnConsult = new javax.swing.JButton();
        btnSalve = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPesNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCli = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menNovo = new javax.swing.JMenu();
        menConsult = new javax.swing.JMenu();
        menSave = new javax.swing.JMenu();
        menEdit = new javax.swing.JMenu();
        menDel = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLabel1.setText("ID:");

        idCli.setEditable(false);

        jLabel2.setText("Nome*:");

        jLabel3.setText("CEP:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Bairro:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("Estado");

        jLabel8.setText("Fone*:");

        jLabel9.setText("Celular:");

        jLabel10.setText("E-mail:");

        brnConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/magnifying-glass.png"))); // NOI18N
        brnConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnConsultActionPerformed(evt);
            }
        });

        btnSalve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/saveicon.png"))); // NOI18N
        btnSalve.setText("Salvar");
        btnSalve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalveActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/pencil (1).png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/cancel.png"))); // NOI18N
        btnDel.setText("Excluir");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jLabel11.setText("Pesquisar:");

        txtPesNome.setToolTipText("Insira o nome do cliente");
        txtPesNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesNomeKeyReleased(evt);
            }
        });

        tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCli);

        jLabel12.setText("*Campos Obrigatórios");

        menNovo.setText("Novo");
        menNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menNovoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menNovo);

        menConsult.setText("Consultar");
        menConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menConsultMouseClicked(evt);
            }
        });
        jMenuBar1.add(menConsult);

        menSave.setText("Salvar");
        menSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menSaveMouseClicked(evt);
            }
        });
        jMenuBar1.add(menSave);

        menEdit.setText("Editar");
        menEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menEditMouseClicked(evt);
            }
        });
        jMenuBar1.add(menEdit);

        menDel.setText("Excluir");
        menDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menDelMouseClicked(evt);
            }
        });
        jMenuBar1.add(menDel);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cepCli, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(enderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(foneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(celCli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(estadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(26, 26, 26)
                                    .addComponent(idCli, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nomeCli)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalve)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPesNome, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brnConsult, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(brnConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cepCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(enderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cidadeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(estadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(foneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(celCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalve)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setBounds(0, 0, 640, 454);
    }// </editor-fold>//GEN-END:initComponents

    //Botão consultar
    private void brnConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnConsultActionPerformed
        try {
            consultaCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_brnConsultActionPerformed

    //O Evento abaixo é do tipo enquanto for digitando em tempo real.
    private void txtPesNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesNomeKeyReleased
        try {
            consultaCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txtPesNomeKeyReleased

    //seleção do conteudo da tabela
    private void tabCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCliMouseClicked
        setarCampos();
    }//GEN-LAST:event_tabCliMouseClicked

    //botão salvar
    private void btnSalveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalveActionPerformed
        try {
            insertCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSalveActionPerformed

    //menu novo
    private void menNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menNovoMouseClicked
        idCli.setText(null);
        nomeCli.setText(null);
        cepCli.setText(null);
        enderecoCli.setText(null);
        bairroCli.setText(null);
        cidadeCli.setText(null);
        estadoCli.setText(null);
        foneCli.setText(null);
        celCli.setText(null);
        emailCli.setText(null);
    }//GEN-LAST:event_menNovoMouseClicked

    //menu salvar
    private void menSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menSaveMouseClicked
        try {
            insertCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_menSaveMouseClicked

    //menu editar
    private void menEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menEditMouseClicked
        try {
            updateCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_menEditMouseClicked

    //menu consultar
    private void menConsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menConsultMouseClicked
        try {
            consultaCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_menConsultMouseClicked

    //botao editar
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            updateCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    //botão excluir
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {
            DeleteCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btnDelActionPerformed

    //menu excluir
    private void menDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menDelMouseClicked
        try {
            DeleteCli();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_menDelMouseClicked

    private void consultaCli() throws SQLException {
        String sql = "select * from tbclientes where nomecli LIKE ? ";

        pst = conexao.prepareStatement(sql);
        pst.setString(1, txtPesNome.getText() + "%");
        rs = pst.executeQuery();

        //Abaixo usamos a biblioteca rs2xml
        tabCli.setModel(DbUtils.resultSetToTableModel(rs));
    }

    //Metodo para preencher o formulário com a consulta da tabela    
    public void setarCampos() {
        int setar = tabCli.getSelectedRow();

        idCli.setText(tabCli.getModel().getValueAt(setar, 0).toString());
        nomeCli.setText(tabCli.getModel().getValueAt(setar, 1).toString());
        cepCli.setText(tabCli.getModel().getValueAt(setar, 2).toString());
        enderecoCli.setText(tabCli.getModel().getValueAt(setar, 3).toString());
        bairroCli.setText(tabCli.getModel().getValueAt(setar, 4).toString());
        cidadeCli.setText(tabCli.getModel().getValueAt(setar, 5).toString());
        estadoCli.setText(tabCli.getModel().getValueAt(setar, 6).toString());
        foneCli.setText(tabCli.getModel().getValueAt(setar, 7).toString());
        celCli.setText(tabCli.getModel().getValueAt(setar, 8).toString());
        emailCli.setText(tabCli.getModel().getValueAt(setar, 9).toString());

    }

    private void insertCli() throws SQLException {
        String sql = "INSERT INTO tbclientes(nomecli, cepcli, enderecocli, bairrocli, cidadecli, estadocli, fonecli, celcli, emailcli) VALUES (?,?,?,?,?,?,?,?,?)";
        try {

            if (nomeCli.getText().isEmpty() || foneCli.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");

            } else {

                pst = conexao.prepareStatement(sql);
                pst.setString(1, nomeCli.getText());
                pst.setString(2, cepCli.getText());
                pst.setString(3, enderecoCli.getText());
                pst.setString(4, bairroCli.getText());
                pst.setString(5, cidadeCli.getText());
                pst.setString(6, estadoCli.getText());
                pst.setString(7, foneCli.getText());
                pst.setString(8, celCli.getText());
                pst.setString(9, emailCli.getText());

                int add = pst.executeUpdate();
                if (add > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    nomeCli.setText(null);
                    cepCli.setText(null);
                    enderecoCli.setText(null);
                    bairroCli.setText(null);
                    cidadeCli.setText(null);
                    estadoCli.setText(null);
                    foneCli.setText(null);
                    celCli.setText(null);
                    emailCli.setText(null);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void updateCli() throws SQLException {

        String sql = "update tbclientes set nomecli = ?, cepcli = ?, enderecocli =?, bairrocli =?, cidadecli =?, estadocli =?, fonecli =?, celcli =?, emailcli =? where idcli =?";
        try {
            pst = conexao.prepareStatement(sql);

            pst.setString(1, nomeCli.getText());
            pst.setString(2, cepCli.getText());
            pst.setString(3, enderecoCli.getText());
            pst.setString(4, bairroCli.getText());
            pst.setString(5, cidadeCli.getText());
            pst.setString(6, estadoCli.getText());
            pst.setString(7, foneCli.getText());
            pst.setString(8, celCli.getText());
            pst.setString(9, emailCli.getText());
            pst.setString(10, idCli.getText());

            int update = pst.executeUpdate();

            if (update > 0) {
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void DeleteCli() throws SQLException {
        String sql = "delete from tbclientes where idcli = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, idCli.getText());

            int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse registro?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
                idCli.setText(null);
                nomeCli.setText(null);
                cepCli.setText(null);
                enderecoCli.setText(null);
                bairroCli.setText(null);
                cidadeCli.setText(null);
                estadoCli.setText(null);
                foneCli.setText(null);
                celCli.setText(null);
                emailCli.setText(null);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroCli;
    private javax.swing.JButton brnConsult;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSalve;
    private javax.swing.JTextField celCli;
    private javax.swing.JTextField cepCli;
    private javax.swing.JTextField cidadeCli;
    private javax.swing.JTextField emailCli;
    private javax.swing.JTextField enderecoCli;
    private javax.swing.JTextField estadoCli;
    private javax.swing.JTextField foneCli;
    public static javax.swing.JTextField idCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menConsult;
    private javax.swing.JMenu menDel;
    private javax.swing.JMenu menEdit;
    private javax.swing.JMenu menNovo;
    private javax.swing.JMenu menSave;
    private javax.swing.JTextField nomeCli;
    private javax.swing.JTable tabCli;
    private javax.swing.JTextField txtPesNome;
    // End of variables declaration//GEN-END:variables
}
