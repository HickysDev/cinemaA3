/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinema;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hickys
 */
public class AdicionarFilmeTela extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarFilmeTela
     */
    public AdicionarFilmeTela() {
        initComponents();
        listarFilmesTabela();
        listarCinemasTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeFilmeTextField = new javax.swing.JTextField();
        cadastrarFilmeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmeTable = new javax.swing.JTable();
        idFilmeTextField = new javax.swing.JTextField();
        idCinemaTextField = new javax.swing.JTextField();
        designarCinemaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cinemaTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emCartazTextField = new javax.swing.JTextField();
        sinopseTextField = new javax.swing.JTextField();
        dataLancamentoTextField = new javax.swing.JTextField();
        alterarJButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        excluirButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeFilmeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("NomeFilme"));

        cadastrarFilmeButton.setText("Cadastrar Filme");
        cadastrarFilmeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFilmeButtonActionPerformed(evt);
            }
        });

        filmeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome Filme", "Data Lançamento", "Cartaz"
            }
        ));
        jScrollPane1.setViewportView(filmeTable);

        idFilmeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("IdFilme"));

        idCinemaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("IdCinema"));

        designarCinemaButton.setText("Designar Cinema");
        designarCinemaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designarCinemaButtonActionPerformed(evt);
            }
        });

        cinemaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IdCinema", "NomeCinema", "Localização"
            }
        ));
        jScrollPane2.setViewportView(cinemaTable);

        jLabel1.setText("Cinemas:");

        jLabel2.setText("Filmes:");

        emCartazTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Em cartaz:"));

        sinopseTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sinopse:"));

        dataLancamentoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Lançamento:"));

        alterarJButton.setText("Alterar");
        alterarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarJButtonActionPerformed(evt);
            }
        });

        idTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("id"));

        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(emCartazTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(alterarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(idFilmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(excluirButton)
                                        .addComponent(idCinemaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(designarCinemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(nomeFilmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(voltarButton))
                            .addComponent(sinopseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(dataLancamentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadastrarFilmeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(243, 243, 243))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeFilmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emCartazTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sinopseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataLancamentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadastrarFilmeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alterarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(designarCinemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(voltarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idFilmeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idCinemaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void designarCinemaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designarCinemaButtonActionPerformed
        // TODO add your handling code here:

        Integer idFilme;
        Integer idCine;

        idFilme = Integer.parseInt(idFilmeTextField.getText());
        idCine = Integer.parseInt(idCinemaTextField.getText());

        VincularCinema vincCine = new VincularCinema();
        vincCine.setIdVincFilme(idFilme);
        vincCine.setIdVincCine(idCine);

        DAO dao = new DAO();
        dao.vincularCinema(vincCine);


    }//GEN-LAST:event_designarCinemaButtonActionPerformed

    private void cadastrarFilmeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFilmeButtonActionPerformed
        // TODO add your handling code here:       
        String nomeFilme;
        Integer emCartaz;
        String sinopse;
        String dataLancamento;

        nomeFilme = nomeFilmeTextField.getText();
        emCartaz = Integer.parseInt(emCartazTextField.getText());
        sinopse = sinopseTextField.getText();
        dataLancamento = dataLancamentoTextField.getText();

        if (emCartaz <= 1) {
            Filme filme = new Filme();
            filme.setNomeFilme(nomeFilme);
            filme.setCartaz(emCartaz);
            filme.setSinopse(sinopse);
            filme.setDataLancamento(dataLancamento);

            Administrador adm = new Administrador();
            adm.cadastrarFilme(filme);
            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso");
            listarFilmesTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Valor digitado errado");
        }


    }//GEN-LAST:event_cadastrarFilmeButtonActionPerformed

    private void alterarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarJButtonActionPerformed
        // TODO add your handling code here:
        AlterarFilme();
        listarFilmesTabela();
    }//GEN-LAST:event_alterarJButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
        ExcluirFilme();
        listarFilmesTabela();
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaPrincipal tela = new TelaPrincipal();

        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarFilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarFilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarFilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarFilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarFilmeTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarJButton;
    private javax.swing.JButton cadastrarFilmeButton;
    private javax.swing.JTable cinemaTable;
    private javax.swing.JTextField dataLancamentoTextField;
    private javax.swing.JButton designarCinemaButton;
    private javax.swing.JTextField emCartazTextField;
    private javax.swing.JButton excluirButton;
    private javax.swing.JTable filmeTable;
    private javax.swing.JTextField idCinemaTextField;
    private javax.swing.JTextField idFilmeTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeFilmeTextField;
    private javax.swing.JTextField sinopseTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

    private void listarFilmesTabela() {
        try {
            DAO dao = new DAO();
            DefaultTableModel model = (DefaultTableModel) filmeTable.getModel();
            model.setNumRows(0);

            ArrayList<Filme> listaFilme = dao.TableFilme();

            for (int num = 0; num < listaFilme.size(); num++) {
                model.addRow(new Object[]{
                    listaFilme.get(num).getId(),
                    listaFilme.get(num).getNomeFilme(),
                    listaFilme.get(num).getCartaz()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarFilmesTabela" + erro);
        }

    }

    private static MouseListener getMouseListener() {
        return new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(((JComponent) e.getSource()).getName());
            }
        };
    }

    private void listarCinemasTabela() {

        cinemaTable.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {

            System.out.println(cinemaTable.getValueAt(cinemaTable.getSelectedRow(), 0).toString());

            String id = cinemaTable.getValueAt(cinemaTable.getSelectedRow(), 0).toString();

            if (id.equals("1")) {
                TelaPrincipal tela = new TelaPrincipal();

                tela.setVisible(true);

                dispose();

            }

        });

        try {
            DAO dao = new DAO();
            DefaultTableModel model = (DefaultTableModel) cinemaTable.getModel();
            model.setNumRows(0);

            ArrayList<Cinema> listaCine = dao.TableCinema();

            for (int num = 0; num < listaCine.size(); num++) {

                model.addRow(new Object[]{
                    listaCine.get(num).getIdCine(),
                    listaCine.get(num).getNomeCinema(),
                    listaCine.get(num).getLocalizacao()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarCinemasTabela" + erro);
        }

    }

    private void AlterarFilme() {
        Integer id;
        String nomeFilme;
        Integer cartaz;
        String sinopse;
        String dataLancamento;

        id = Integer.parseInt(idTextField.getText());
        nomeFilme = nomeFilmeTextField.getText();
        cartaz = Integer.parseInt(emCartazTextField.getText());
        sinopse = sinopseTextField.getText();
        dataLancamento = dataLancamentoTextField.getText();

        Filme filme = new Filme();
        filme.setId(id);
        filme.setNomeFilme(nomeFilme);
        filme.setCartaz(cartaz);
        filme.setSinopse(sinopse);
        filme.setDataLancamento(dataLancamento);

        DAO dao = new DAO();

        dao.alterarFilme(filme);
    }

    private void ExcluirFilme() {
        Integer id;
        id = Integer.parseInt(idTextField.getText());

        Filme filme = new Filme();
        filme.setId(id);

        DAO dao = new DAO();
        dao.excluirFilmeExiste(filme);
        dao.excluirFilme(filme);

    }
}
