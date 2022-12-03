package com.mycompany.cinema;

import java.sql.ResultSet;
import java.sql.SQLException;
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

        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        cadastrarJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha:"));
        senhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaPasswordFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        cadastrarJButton.setText("Cadastrar-se");
        cadastrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginTextField)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(loginButton)
                        .addGap(30, 30, 30)
                        .addComponent(sairButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cadastrarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(sairButton))
                .addGap(58, 58, 58)
                .addComponent(cadastrarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaPasswordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            String email, senha;

            email = loginTextField.getText();
            senha = new String(senhaPasswordField.getPassword());

            
            PerfilTela perfiltela = new PerfilTela();
            Usuario usuarioLogin = new Usuario();
            TelaPrincipal telaprincipal = new TelaPrincipal();
            usuarioLogin.setEmail(email);
            usuarioLogin.setSenha(senha);

            DAO autenticacao = new DAO();
            ResultSet rsUsuarioValido = autenticacao.autenticacaoUsuario(usuarioLogin);

            if (rsUsuarioValido.next()) {
                autenticacao.armazenarDados(usuarioLogin);
                telaprincipal.emailCache = usuarioLogin.getEmail();
                telaprincipal.exibirBotao(autenticacao.verificacaoAdmin(usuarioLogin));
                telaprincipal.setVisible(true);

                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e Senha inválidos");

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LoginTela: " + erro);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed

        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void cadastrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarJButtonActionPerformed
        // TODO add your handling code here:
        CadastroTela cad = new CadastroTela();
        cad.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cadastrarJButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarJButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
