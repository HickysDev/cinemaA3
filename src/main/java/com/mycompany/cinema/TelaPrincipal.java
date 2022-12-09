package com.mycompany.cinema;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    public String emailCache;

    public TelaPrincipal() {
        initComponents();
        listarTodosFilmesTabela();
        this.selecionarLinhaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        perfilButton = new javax.swing.JButton();
        adicionarButton = new javax.swing.JButton();
        cinemasButton = new javax.swing.JButton();
        filmesCartazButton = new javax.swing.JButton();
        todosFilmesButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        AddCinemaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        principalTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        perfilButton.setText("Perfil");
        perfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilButtonActionPerformed(evt);
            }
        });

        adicionarButton.setText("Adicionar Filme");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        cinemasButton.setText("Cinemas");
        cinemasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinemasButtonActionPerformed(evt);
            }
        });

        filmesCartazButton.setText("Filmes em cartaz");
        filmesCartazButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmesCartazButtonActionPerformed(evt);
            }
        });

        todosFilmesButton.setText("Todos os Filmes");
        todosFilmesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosFilmesButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        AddCinemaButton.setText("Adicionar Cinema");
        AddCinemaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCinemaButtonActionPerformed(evt);
            }
        });

        principalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data Lançamento", "Em Cartaz"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        principalTable.setFocusable(false);
        jScrollPane2.setViewportView(principalTable);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(todosFilmesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filmesCartazButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddCinemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinemasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sairButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(perfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(todosFilmesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filmesCartazButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cinemasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddCinemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sairButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exibirBotao(boolean permissao) {
        System.out.println("permissao: " + permissao);
        if (permissao == true) {
            cinemasButton.setVisible(true);
            adicionarButton.setVisible(true);
            System.out.println("deu certo");
        } else {
            adicionarButton.setVisible(false);
            System.out.println("deu errado");
        }
    }

    private void perfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilButtonActionPerformed
        DAO dao = new DAO();

        Usuario usuario = new Usuario();

        PerfilTela perfil = new PerfilTela();

        EditarPefilTela editarPerfil = new EditarPefilTela();
        
        System.out.println("email cache tela:" + emailCache);
        

        dao.armazenarDados(usuario);


        perfil.emailCache = emailCache;
        
        perfil.exibirDados();
        
        System.out.println("email cache tela perfil:" + perfil.emailCache);
        
        perfil.setVisible(true);
        dispose();


    }//GEN-LAST:event_perfilButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        AdicionarFilmeTela add = new AdicionarFilmeTela();
        add.setVisible(true);

        dispose();
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void cinemasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinemasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinemasButtonActionPerformed

    private void todosFilmesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosFilmesButtonActionPerformed

        listarTodosFilmesTabela();

    }//GEN-LAST:event_todosFilmesButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sairButtonActionPerformed

    private void AddCinemaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCinemaButtonActionPerformed
        // TODO add your handling code here:
        AdicionarCinemaTela add = new AdicionarCinemaTela();
        add.setVisible(true);

        dispose();
    }//GEN-LAST:event_AddCinemaButtonActionPerformed

    private void filmesCartazButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesCartazButtonActionPerformed

        listarFilmesEmCartazTabela();

    }//GEN-LAST:event_filmesCartazButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });

    }

    private void selecionarLinhaTabela() {
        FilmeTela telafilme = new FilmeTela();

        principalTable.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            int selectedRow = principalTable.getSelectedRow();
            if (selectedRow == -1) {
                return;
            }
            telafilme.idCache = Integer.parseInt(principalTable.getValueAt(principalTable.getSelectedRow(), 0).toString());
            telafilme.exibirFilme();
            System.out.println(telafilme.idCache);
        });
        principalTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {

                    telafilme.setVisible(true);
                    dispose();
                }
            }
        });

    }

    private void listarTodosFilmesTabela() {

        ArrayList<Filme> listaFilme = new ArrayList<>();

        try {
            DAO dao = new DAO();
            DefaultTableModel model = (DefaultTableModel) principalTable.getModel();
            model.setRowCount(0);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();

            listaFilme = dao.TableFilme();

            for (int num = 0; num < listaFilme.size(); num++) {
                model.addRow(new Object[]{
                    listaFilme.get(num).getId(),
                    listaFilme.get(num).getNomeFilme(),
                    listaFilme.get(num).getCartaz()
                });

            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarFilmesTabela: " + erro);
        }

    }

    private void listarFilmesEmCartazTabela() {

        ArrayList<Filme> listaFilmeCartaz = new ArrayList<>();

        try {
            DAO dao = new DAO();
            DefaultTableModel model = (DefaultTableModel) principalTable.getModel();
            model.setRowCount(0);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();

            listaFilmeCartaz = dao.TableFilmeCartaz();

            for (int num = 0; num < listaFilmeCartaz.size(); num++) {
                model.addRow(new Object[]{
                    listaFilmeCartaz.get(num).getId(),
                    listaFilmeCartaz.get(num).getNomeFilme(),
                    listaFilmeCartaz.get(num).getCartaz()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarFilmesCartazTabela" + erro);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCinemaButton;
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton cinemasButton;
    private javax.swing.JButton filmesCartazButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton perfilButton;
    private javax.swing.JTable principalTable;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton todosFilmesButton;
    // End of variables declaration//GEN-END:variables
}
