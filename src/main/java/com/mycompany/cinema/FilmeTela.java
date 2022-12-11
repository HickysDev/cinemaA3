package com.mycompany.cinema;

import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class FilmeTela extends javax.swing.JFrame {
    public int idCache;
    public String emailCache;
    

    public FilmeTela() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        sinopseText = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        cinemaTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomeFilmeText = new javax.swing.JTextArea();
        Fundo = new javax.swing.JLabel();

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
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        dataText.setEditable(false);
        dataText.setColumns(20);
        dataText.setRows(5);
        jScrollPane2.setViewportView(dataText);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 31));

        sinopseText.setEditable(false);
        sinopseText.setColumns(20);
        sinopseText.setLineWrap(true);
        sinopseText.setRows(5);
        jScrollPane3.setViewportView(sinopseText);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 290, 390));

        cinemaTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(cinemaTable);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 430, 520));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filmes");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Filme:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sinopse:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voltarTelas.png"))); // NOI18N
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarMouseExited(evt);
            }
        });
        jPanel2.add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        nomeFilmeText.setEditable(false);
        nomeFilmeText.setColumns(20);
        nomeFilmeText.setRows(5);
        jScrollPane1.setViewportView(nomeFilmeText);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 30));

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundoCinzaDark.png"))); // NOI18N
        jPanel2.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        // TODO add your handling code here:
        TelaPrincipal telaprincipal = new TelaPrincipal();
        
        
        telaprincipal.emailCache = emailCache;
        telaprincipal.exibirBotao();
        telaprincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarMouseClicked

    private void VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseEntered
        // TODO add your handling code here:
        ImageIcon btnVoltar = new ImageIcon(getClass().getResource("/voltarTelas1.png"));
        Voltar.setIcon(btnVoltar);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        Voltar.setCursor(crs);
    }//GEN-LAST:event_VoltarMouseEntered

    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited
        // TODO add your handling code here:
        ImageIcon btnVoltar = new ImageIcon(getClass().getResource("/voltarTelas.png"));
        Voltar.setIcon(btnVoltar);
    }//GEN-LAST:event_VoltarMouseExited
        
    public void exibirFilme(){
    
        Filme filme = new Filme();
        DAO dao = new DAO();
        
        filme.setId(idCache);
        
        dao.armazenarDadosFilme(filme);
        
        System.out.println(filme.getNomeFilme());
        
        nomeFilmeText.setText(filme.getNomeFilme());
        dataText.setText(filme.getDataLancamento());
        sinopseText.setText(filme.getSinopse());
        
    }
    
    public void listaCinemas(){
        DAO dao = new DAO();
        ArrayList<Cinema> listaCineFilmeTela = new ArrayList<>();

        try {
            DefaultTableModel model = (DefaultTableModel) cinemaTable.getModel();
            model.setRowCount(0);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();

            listaCineFilmeTela = dao.filmeTelaTable(idCache);

            for (int num = 0; num < listaCineFilmeTela.size(); num++) {
                model.addRow(new Object[]{
                    listaCineFilmeTela.get(num).getIdCine(),
                    listaCineFilmeTela.get(num).getNomeCinema(),
                    listaCineFilmeTela.get(num).getLocalizacao(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarFilmesCartazTabela" + erro);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(FilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmeTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmeTela().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Voltar;
    private javax.swing.JTable cinemaTable;
    private javax.swing.JTextArea dataText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea nomeFilmeText;
    private javax.swing.JTextArea sinopseText;
    // End of variables declaration//GEN-END:variables
}
