/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinema;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jvcal
 */
public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTela
     */
    public CadastroTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeUsuarioTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cepTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registrarJButton = new javax.swing.JButton();
        senhaTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeUsuarioTextField.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar Conta");

        jLabel2.setText("Nome de usuário");

        jLabel3.setText("E-mail");

        jLabel4.setText("CEP");

        jLabel5.setText("Senha");

        registrarJButton.setText("Registrar");
        registrarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senhaTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cepTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(nomeUsuarioTextField)
                            .addComponent(registrarJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(emailTextField))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(registrarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int local;
    private void registrarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarJButtonActionPerformed
        // TODO add your handling code here:

        Cadastro();
    }//GEN-LAST:event_registrarJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public void Cadastro() {
        Usuario usuarioLogin = new Usuario();
        TelaPrincipal telaprincipal = new TelaPrincipal();
        try {
            String email, senha, nomeUsuario;
            Integer cep;

            email = emailTextField.getText();
            senha = new String(senhaTextField.getPassword());
            cep = Integer.parseInt(cepTextField.getText());
            nomeUsuario = nomeUsuarioTextField.getText();
            String adm = "0";
            

            // atribui os 
            usuarioLogin.setEmail(email);
            usuarioLogin.setSenha(senha);
            usuarioLogin.setCep(cep);
            usuarioLogin.setNomeUsuario(nomeUsuario);
            usuarioLogin.setAdministrador(adm);
            

            DAO autenticacao = new DAO();

            ResultSet rsUsuarioValidoCad = autenticacao.autenticacaoCadastro(usuarioLogin);
            if (rsUsuarioValidoCad.next()) {
                JOptionPane.showMessageDialog(null, "Email já existente");
            } else if (email.isBlank() || senha.isBlank() || cep == null || nomeUsuario.isBlank()) {
                JOptionPane.showMessageDialog(null, "Campos inválidos");

            } else {

                if (isBetween(cep, 1000000, 1099999)) {
                    local = 1;
                    usuarioLogin.setLocal(local);
                    System.out.println(local);

                } else if (isBetween(cep, 2000000, 2072002)) {
                    System.out.println("testing case 1 to 5");

                } else {
                    System.out.println("deu merda");
                    
                }
                autenticacao.CadastrarUsuario(usuarioLogin);
                autenticacao.armazenarDados(usuarioLogin);
                telaprincipal.emailCache = usuarioLogin.getEmail();
                telaprincipal.exibirBotao(autenticacao.verificacaoAdmin(usuarioLogin));
                telaprincipal.setVisible(true);
                dispose();

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "LoginTela: " + erro);
        };

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeUsuarioTextField;
    private javax.swing.JButton registrarJButton;
    private javax.swing.JPasswordField senhaTextField;
    // End of variables declaration//GEN-END:variables
}
