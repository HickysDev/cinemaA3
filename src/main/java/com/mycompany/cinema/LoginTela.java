package com.mycompany.cinema;

import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginTela extends javax.swing.JFrame {

    public LoginTela() {
        super("Sistema Acadêmico");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        login1 = new javax.swing.JLabel();
        cadastrar1 = new javax.swing.JLabel();
        sair1 = new javax.swing.JLabel();
        erroTexto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 198, 55));

        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha:"));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 198, 55));

        login1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login1MouseExited(evt);
            }
        });
        jPanel1.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        cadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastrar.png"))); // NOI18N
        cadastrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastrar1MouseExited(evt);
            }
        });
        jPanel1.add(cadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        sair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair2.png"))); // NOI18N
        sair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sair1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sair1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sair1MouseExited(evt);
            }
        });
        jPanel1.add(sair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        erroTexto1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        erroTexto1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(erroTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 190, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundoCinzaDark.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 406));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        // TODO add your handling code here:
        try {
            String email, senha;

            email = loginTextField.getText();
            senha = new String(senhaPasswordField.getPassword());

            
            
            Usuario usuarioLogin = new Usuario();
            TelaPrincipal telaprincipal = new TelaPrincipal();
            usuarioLogin.setEmail(email);
            usuarioLogin.setSenha(senha);

            DAO autenticacao = new DAO();
            ResultSet rsUsuarioValido = autenticacao.autenticacaoUsuario(usuarioLogin);

            if (rsUsuarioValido.next()) {
                autenticacao.armazenarDados(usuarioLogin);
                telaprincipal.emailCache = usuarioLogin.getEmail();
                telaprincipal.exibirBotao();
                telaprincipal.setVisible(true);

                dispose();
            } else {
                erroTexto1.setText("Usuário ou Senha inválidos...");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LoginTela: " + erro);
        }
    }//GEN-LAST:event_login1MouseClicked

    private void login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseEntered
        // TODO add your handling code here:
         ImageIcon btnCadastro = new ImageIcon(getClass().getResource("/login1.png"));
        login1.setIcon(btnCadastro);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        login1.setCursor(crs);
    }//GEN-LAST:event_login1MouseEntered

    private void login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseExited
        // TODO add your handling code here:
        ImageIcon btnCadastro = new ImageIcon(getClass().getResource("/login.png"));
        login1.setIcon(btnCadastro);
    }//GEN-LAST:event_login1MouseExited

    private void sair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sair1MouseClicked

    private void sair1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair1MouseEntered
        // TODO add your handling code here:
        ImageIcon btnCadastro = new ImageIcon(getClass().getResource("/sair3.png"));
        sair1.setIcon(btnCadastro);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        sair1.setCursor(crs);
    }//GEN-LAST:event_sair1MouseEntered

    private void sair1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sair1MouseExited
        // TODO add your handling code here:
        ImageIcon btnCadastro = new ImageIcon(getClass().getResource("/sair2.png"));
        sair1.setIcon(btnCadastro);
    }//GEN-LAST:event_sair1MouseExited

    private void cadastrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar1MouseClicked
        // TODO add your handling code here:
        CadastroTela cad = new CadastroTela();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrar1MouseClicked

    private void cadastrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar1MouseEntered
        // TODO add your handling code here:
        ImageIcon btnCadastro = new ImageIcon(getClass().getResource("/cadastrar1.png"));
        cadastrar1.setIcon(btnCadastro);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        cadastrar1.setCursor(crs);
    }//GEN-LAST:event_cadastrar1MouseEntered

    private void cadastrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar1MouseExited
        // TODO add your handling code here:
        ImageIcon btnCadastro = new ImageIcon(getClass().getResource("/cadastrar.png"));
        cadastrar1.setIcon(btnCadastro);
    }//GEN-LAST:event_cadastrar1MouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastrar1;
    private javax.swing.JLabel erroTexto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel sair1;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
