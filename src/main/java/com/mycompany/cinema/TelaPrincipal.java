package com.mycompany.cinema;

import java.awt.Color;
import java.awt.Cursor;
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
    public int localizacao;
    public int cinemaIdCache;
    public int filmeIdCache;

    public TelaPrincipal() {
        initComponents();
        listarCinemasTabela();
        listarTodosFilmesTabela();
        this.selecionarLinhaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        principalTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        cinemaTable = new javax.swing.JTable();
        Sair = new javax.swing.JLabel();
        addFilme = new javax.swing.JLabel();
        addCinema = new javax.swing.JLabel();
        allCinemas = new javax.swing.JLabel();
        Cinemas = new javax.swing.JLabel();
        Perfil = new javax.swing.JLabel();
        allFilmes = new javax.swing.JLabel();
        Cartaz = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        if (principalTable.getColumnModel().getColumnCount() > 0) {
            principalTable.getColumnModel().getColumn(0).setResizable(false);
            principalTable.getColumnModel().getColumn(1).setResizable(false);
            principalTable.getColumnModel().getColumn(2).setResizable(false);
            principalTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 534, 300));

        cinemaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome Cinema", "Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cinemaTable);
        if (cinemaTable.getColumnModel().getColumnCount() > 0) {
            cinemaTable.getColumnModel().getColumn(0).setResizable(false);
            cinemaTable.getColumnModel().getColumn(1).setResizable(false);
            cinemaTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 534, 230));

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sair.png"))); // NOI18N
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairMouseExited(evt);
            }
        });
        jPanel1.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, -1, -1));

        addFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addFilme.png"))); // NOI18N
        addFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFilmeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addFilmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addFilmeMouseExited(evt);
            }
        });
        jPanel1.add(addFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, -1, -1));

        addCinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addCinema.png"))); // NOI18N
        addCinema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCinemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addCinemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addCinemaMouseExited(evt);
            }
        });
        jPanel1.add(addCinema, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, -1, -1));

        allCinemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allCinemas.png"))); // NOI18N
        allCinemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allCinemasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allCinemasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allCinemasMouseExited(evt);
            }
        });
        jPanel1.add(allCinemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Cinemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasBTN.png"))); // NOI18N
        Cinemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CinemasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CinemasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CinemasMouseExited(evt);
            }
        });
        jPanel1.add(Cinemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfilBTN.png"))); // NOI18N
        Perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PerfilMouseExited(evt);
            }
        });
        jPanel1.add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        allFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allFilmes.png"))); // NOI18N
        allFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allFilmesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                allFilmesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                allFilmesMouseExited(evt);
            }
        });
        jPanel1.add(allFilmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Cartaz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filmesCartaz.png"))); // NOI18N
        Cartaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartazMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CartazMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CartazMouseExited(evt);
            }
        });
        jPanel1.add(Cartaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filmes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 60, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cinemas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 80, -1));

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundoCinzaDark.png"))); // NOI18N
        Fundo.setText("jLabel1");
        jPanel1.add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exibirBotao() {
        DAO dao = new DAO();
        Usuario usuario = new Usuario();

        usuario.setEmail(emailCache);

        dao.armazenarDados(usuario);

        if (usuario.getAdministrador().equals("1")) {
            addFilme.setVisible(true);
            addCinema.setVisible(true);
        }else {
            addFilme.setVisible(false);
            addCinema.setVisible(false);
        }

    }

    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        // TODO add your handling code here:
        LoginTela logintela = new LoginTela();
        logintela.setVisible(true);

        dispose();
    }//GEN-LAST:event_SairMouseClicked

    private void SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseEntered
        // TODO add your handling code here:
        ImageIcon btnSair = new ImageIcon(getClass().getResource("/Sair1.png"));
        Sair.setIcon(btnSair);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        Sair.setCursor(crs);
    }//GEN-LAST:event_SairMouseEntered

    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
        // TODO add your handling code here:
        ImageIcon btnSair = new ImageIcon(getClass().getResource("/Sair.png"));
        Sair.setIcon(btnSair);
    }//GEN-LAST:event_SairMouseExited

    private void addFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFilmeMouseClicked
        // TODO add your handling code here:
        AdicionarFilmeTela add = new AdicionarFilmeTela();

        add.emailCache = emailCache;
        add.setVisible(true);

        dispose();
    }//GEN-LAST:event_addFilmeMouseClicked

    private void addFilmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFilmeMouseEntered
        // TODO add your handling code here:
        ImageIcon btnFilmeAdd = new ImageIcon(getClass().getResource("/addFilme1.png"));
        addFilme.setIcon(btnFilmeAdd);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        addFilme.setCursor(crs);
    }//GEN-LAST:event_addFilmeMouseEntered

    private void addFilmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFilmeMouseExited
        // TODO add your handling code here:
        ImageIcon btnFilmeAdd = new ImageIcon(getClass().getResource("/addFilme.png"));
        addFilme.setIcon(btnFilmeAdd);
    }//GEN-LAST:event_addFilmeMouseExited

    private void addCinemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCinemaMouseClicked
        // TODO add your handling code here:
        AdicionarCinemaTela add = new AdicionarCinemaTela();

        add.emailCache = emailCache;
        add.setVisible(true);

        dispose();
    }//GEN-LAST:event_addCinemaMouseClicked

    private void addCinemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCinemaMouseEntered
        // TODO add your handling code here:
        ImageIcon btnAddCinema = new ImageIcon(getClass().getResource("/addCinema1.png"));
        addCinema.setIcon(btnAddCinema);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        addCinema.setCursor(crs);
    }//GEN-LAST:event_addCinemaMouseEntered

    private void addCinemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCinemaMouseExited
        // TODO add your handling code here:
        ImageIcon btnAddCinema = new ImageIcon(getClass().getResource("/addCinema.png"));
        addCinema.setIcon(btnAddCinema);
    }//GEN-LAST:event_addCinemaMouseExited

    private void allCinemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allCinemasMouseClicked
        // TODO add your handling code here:
        listarCinemasTabela();
    }//GEN-LAST:event_allCinemasMouseClicked

    private void allCinemasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allCinemasMouseEntered
        // TODO add your handling code here:
        ImageIcon btnAllCinema = new ImageIcon(getClass().getResource("/allCinemas1.png"));
        allCinemas.setIcon(btnAllCinema);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        allCinemas.setCursor(crs);
    }//GEN-LAST:event_allCinemasMouseEntered

    private void allCinemasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allCinemasMouseExited
        // TODO add your handling code here:
        ImageIcon btnAllCinema = new ImageIcon(getClass().getResource("/allCinemas.png"));
        allCinemas.setIcon(btnAllCinema);
    }//GEN-LAST:event_allCinemasMouseExited

    private void CinemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinemasMouseClicked
        // TODO add your handling code here:
        listarCinemaProximosTabela();
    }//GEN-LAST:event_CinemasMouseClicked

    private void CinemasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinemasMouseEntered
        // TODO add your handling code here:
        ImageIcon btnCinema = new ImageIcon(getClass().getResource("/cinemasBTN1.png"));
        Cinemas.setIcon(btnCinema);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        Cinemas.setCursor(crs);
    }//GEN-LAST:event_CinemasMouseEntered

    private void CinemasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinemasMouseExited
        // TODO add your handling code here:
        ImageIcon btnCinema = new ImageIcon(getClass().getResource("/cinemasBTN.png"));
        Cinemas.setIcon(btnCinema);
        
    }//GEN-LAST:event_CinemasMouseExited

    private void PerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseClicked
        // TODO add your handling code here:
        DAO dao = new DAO();

        Usuario usuario = new Usuario();

        PerfilTela perfil = new PerfilTela();

        EditarPefilTela editarPerfil = new EditarPefilTela();

        System.out.println("email cache tela:" + emailCache);
        usuario.setEmail(emailCache);
        dao.armazenarDados(usuario);

        perfil.emailCache = emailCache;

        perfil.exibirDados();

        System.out.println("email cache tela perfil:" + perfil.emailCache);
        System.out.println("local do usuario" + usuario.getLocal());

        perfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_PerfilMouseClicked

    private void PerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseEntered
        // TODO add your handling code here:
        ImageIcon btnPerfil = new ImageIcon(getClass().getResource("/perfilBTN1.png"));
        Perfil.setIcon(btnPerfil);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        Perfil.setCursor(crs);
    }//GEN-LAST:event_PerfilMouseEntered

    private void PerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilMouseExited
        // TODO add your handling code here:
        ImageIcon btnPerfil = new ImageIcon(getClass().getResource("/perfilBTN.png"));
        Perfil.setIcon(btnPerfil);
    }//GEN-LAST:event_PerfilMouseExited

    private void allFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allFilmesMouseClicked
        // TODO add your handling code here:
        listarTodosFilmesTabela();
    }//GEN-LAST:event_allFilmesMouseClicked

    private void allFilmesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allFilmesMouseEntered
        // TODO add your handling code here:
        ImageIcon btnAllFilmes = new ImageIcon(getClass().getResource("/allFilmes1.png"));
        allFilmes.setIcon(btnAllFilmes);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        allFilmes.setCursor(crs);
    }//GEN-LAST:event_allFilmesMouseEntered

    private void allFilmesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allFilmesMouseExited
        // TODO add your handling code here:
        ImageIcon btnAllFilmes = new ImageIcon(getClass().getResource("/allFilmes.png"));
        allFilmes.setIcon(btnAllFilmes);
    }//GEN-LAST:event_allFilmesMouseExited

    private void CartazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartazMouseClicked
        // TODO add your handling code here:
         listarFilmesEmCartazTabela();
    }//GEN-LAST:event_CartazMouseClicked

    private void CartazMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartazMouseEntered
        // TODO add your handling code here:
        ImageIcon btnCartaz = new ImageIcon(getClass().getResource("/filmesCartaz1.png"));
        Cartaz.setIcon(btnCartaz);
        Cursor crs = new Cursor(Cursor.HAND_CURSOR);
        Cartaz.setCursor(crs);
    }//GEN-LAST:event_CartazMouseEntered

    private void CartazMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartazMouseExited
        // TODO add your handling code here:
        ImageIcon btnCartaz = new ImageIcon(getClass().getResource("/filmesCartaz.png"));
        Cartaz.setIcon(btnCartaz);
    }//GEN-LAST:event_CartazMouseExited

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

        cinemaTable.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            int selectedRow = cinemaTable.getSelectedRow();
            if (selectedRow == -1) {
                return;
            }
            cinemaIdCache = Integer.parseInt(cinemaTable.getValueAt(cinemaTable.getSelectedRow(), 0).toString());

        });
        cinemaTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {
                    CinemaTela cinematela = new CinemaTela();
                    cinematela.emailCache = emailCache;
                    cinematela.idCache = cinemaIdCache;
                    cinematela.exibirCinema();
                    cinematela.listaFilmes();
                    cinematela.setVisible(true);
                    dispose();
                }
            }
        });

        principalTable.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            int selectedRow = principalTable.getSelectedRow();
            if (selectedRow == -1) {
                return;
            }
            filmeIdCache = Integer.parseInt(principalTable.getValueAt(principalTable.getSelectedRow(), 0).toString());
        });
        principalTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {
                    FilmeTela telafilme = new FilmeTela();
                    telafilme.emailCache = emailCache;
                    telafilme.idCache = filmeIdCache;
                    telafilme.exibirFilme();
                    telafilme.listaCinemas();
                    telafilme.setVisible(true);
                    dispose();
                }
            }
        });

    }

    // TODO add your handling code here:
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

    public void listarCinemasTabela() {

        ArrayList<Cinema> listaCinema = new ArrayList<>();

        try {
            DAO dao = new DAO();
            DefaultTableModel model = (DefaultTableModel) cinemaTable.getModel();
            model.setRowCount(0);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();

            listaCinema = dao.TableCinema();

            for (int num = 0; num < listaCinema.size(); num++) {
                model.addRow(new Object[]{
                    listaCinema.get(num).getIdCine(),
                    listaCinema.get(num).getNomeCinema(),
                    listaCinema.get(num).getLocalizacao(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarFilmesCartazTabela" + erro);
        }

    }

    public void listarCinemaProximosTabela() {

        ArrayList<Cinema> listaCinema = new ArrayList<>();
        Usuario usuario = new Usuario();
        DAO dao = new DAO();

        usuario.setEmail(emailCache);
        dao.armazenarDados(usuario);
        System.out.println("Local usuario Tela Principal: " + usuario.getLocal());

        try {
            DefaultTableModel model = (DefaultTableModel) cinemaTable.getModel();
            model.setRowCount(0);
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();

            listaCinema = dao.TableCinemaProximo(usuario);

            for (int num = 0; num < listaCinema.size(); num++) {
                model.addRow(new Object[]{
                    listaCinema.get(num).getIdCine(),
                    listaCinema.get(num).getNomeCinema(),
                    listaCinema.get(num).getLocalizacao(),});

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro no listarFilmesCartazTabela" + erro);
        }

    }

    public void voltar() {
        DAO dao = new DAO();
        Usuario usuario = new Usuario();

        usuario.setEmail(emailCache);

        dao.armazenarDados(usuario);

        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cartaz;
    private javax.swing.JLabel Cinemas;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Perfil;
    private javax.swing.JLabel Sair;
    private javax.swing.JLabel addCinema;
    private javax.swing.JLabel addFilme;
    private javax.swing.JLabel allCinemas;
    private javax.swing.JLabel allFilmes;
    private javax.swing.JTable cinemaTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable principalTable;
    // End of variables declaration//GEN-END:variables
}
