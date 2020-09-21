package br.com.infox.telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadOs = new javax.swing.JMenuItem();
        menCadUser = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelServ = new javax.swing.JMenuItem();
        menAju = new javax.swing.JMenu();
        menAjuSobre = new javax.swing.JMenuItem();
        menOp = new javax.swing.JMenu();
        menOpSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Sistema de controle para ordem de serviço");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setBackground(new java.awt.Color(240, 240, 240));
        desktop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        desktop.setMaximumSize(new java.awt.Dimension(640, 480));
        desktop.setMinimumSize(new java.awt.Dimension(640, 480));
        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/x-png-icon-8.png"))); // NOI18N

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUser.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblData.setText("Data");

        menCad.setText("Cadastro");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menCadCli.setText("Cliente");
        menCad.add(menCadCli);

        menCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menCadOs.setText("OS");
        menCad.add(menCadOs);

        menCadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUser.setText("Usuário");
        menCadUser.setEnabled(false);
        menCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUserActionPerformed(evt);
            }
        });
        menCad.add(menCadUser);

        menu.add(menCad);

        menRel.setText("Relatório");
        menRel.setEnabled(false);

        menRelServ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menRelServ.setText("Serviços");
        menRel.add(menRelServ);

        menu.add(menRel);

        menAju.setText("Ajuda");

        menAjuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menAjuSobre.setText("Sobre");
        menAjuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuSobreActionPerformed(evt);
            }
        });
        menAju.add(menAjuSobre);

        menu.add(menAju);

        menOp.setText("Opções");

        menOpSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOpSair.setText("Sair");
        menOpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpSairActionPerformed(evt);
            }
        });
        menOp.add(menOpSair);

        menu.add(menOp);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addComponent(lblData)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addGap(18, 18, 18)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        setSize(new java.awt.Dimension(966, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUserActionPerformed
        TelaUsuario caduser = new TelaUsuario();
        caduser.setVisible(true);
        desktop.add(caduser);
    }//GEN-LAST:event_menCadUserActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menOpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpSairActionPerformed
        //menu de saida
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menOpSairActionPerformed

    private void menAjuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuSobreActionPerformed

        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_menAjuSobreActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUser;
    private javax.swing.JMenu menAju;
    private javax.swing.JMenuItem menAjuSobre;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    private javax.swing.JMenuItem menCadOs;
    public static javax.swing.JMenuItem menCadUser;
    private javax.swing.JMenu menOp;
    private javax.swing.JMenuItem menOpSair;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelServ;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
