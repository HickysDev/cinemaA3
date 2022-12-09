package com.mycompany.cinema;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DAO {

    public String emailCache, nomeUsuarioCache, cepCache, administradorCache;

    Connection conn;

    PreparedStatement pstm;

    public ResultSet autenticacaoCadastro(Usuario usuario) {
        conn = new ConnectionFactory().obtemConexao();

        try {
            String sql = "Select * from tb_usuario where email = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());

            ResultSet rs = ps.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO :" + erro);
            return null;
        }

    }

    public ResultSet autenticacaoUsuario(Usuario usuario) {
        conn = new ConnectionFactory().obtemConexao();

        try {
            String sql = "Select * from tb_usuario where email = ? and senha = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());

            ResultSet rs = ps.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO autenticação :" + erro);
            return null;
        }

    }

    public ResultSet cadastrarUsuario(Usuario usuario) {
        //Definir comando SQL
        String sql = "INSERT INTO tb_usuario(nomeUsuario, cep, email, senha,administrador, local) VALUES (?,?,?,?,?,?)";

        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        try ( Connection c = factory.obtemConexao()) {
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);

            String adm = "0";
            // Preenche os dados
            ps.setString(1, usuario.getNomeUsuario());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getCep());
            ps.setString(4, usuario.getSenha());
            ps.setString(5, adm);
            ps.setInt(6, usuario.getLocal());
            //Executar o comando
            ps.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO :" + erro);
        }
        return null;
    }

    public boolean verificacaoAdmin(Usuario usuario) {
        conn = new ConnectionFactory().obtemConexao();
        String adminisradorValido = "";
        try {
            String sql = "Select administrador from tb_usuario where email = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                adminisradorValido = rs.getString("administrador");

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO verificação administrador :" + erro);

        }
        System.out.println("DAO: " + adminisradorValido);

        if (adminisradorValido.equals("1")) {
            return true;
        } else {
            return false;
        }

    }

    public void cadastrarFilme(Filme filme) {
        String sql = "INSERT INTO tb_filme (nomeFilme,cartaz,sinopse,dataLancamento) VALUES (?,?,?,?)";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, filme.getNomeFilme());
            pstm.setInt(2, filme.getCartaz());
            pstm.setString(3, filme.getSinopse());
            pstm.setString(4, filme.getDataLancamento());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no cadastrar" + erro);
        }

    }

    public void cadastrarCinema(Cinema cine) {
        String sql = "INSERT INTO tb_cinema (nomeCinema, localizacao) VALUES (?,?)";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cine.getNomeCinema());
            pstm.setInt(2, cine.getLocalizacao());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cinema cadastrado com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no cadastrarCinema" + erro);
        }

    }
    ResultSet rs;
    ArrayList<Filme> listaFilme = new ArrayList<>();
    ArrayList<Filme> listaFilmeCartaz = new ArrayList<>();
    ArrayList<Cinema> listaCine = new ArrayList<>();

    public ArrayList<Filme> TableFilme() {

        String sql = "SELECT id,nomeFilme,cartaz,sinopse,dataLancamento FROM tb_filme";
        conn = new ConnectionFactory().obtemConexao();
        try {
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setNomeFilme(rs.getString("nomeFilme"));
                filme.setDataLancamento(rs.getString("dataLancamento"));
                filme.setCartaz(rs.getInt("cartaz"));

                listaFilme.add(filme);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no tablefilme" + erro);
        }
        return listaFilme;
    }

    public ArrayList<Filme> TableFilmeCartaz() {

        String sql = "SELECT id,nomeFilme,cartaz,sinopse,dataLancamento FROM tb_filme Where cartaz = 1";
        conn = new ConnectionFactory().obtemConexao();
        try {
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                TelaPrincipal tela = new TelaPrincipal();
                filme.setId(rs.getInt("id"));
                filme.setNomeFilme(rs.getString("nomeFilme"));
                filme.setDataLancamento(rs.getString("dataLancamento"));
                filme.setCartaz(rs.getInt("cartaz"));

                listaFilmeCartaz.add(filme);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no tablefilme" + erro);
        }
        return listaFilmeCartaz;
    }

    public void vincularCinema(VincularCinema vincCine) {
        String sql = "INSERT INTO filme_existe_cinema (idFilme, idCinema) VALUES (?,?)";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, vincCine.getIdVincFilme());
            pstm.setInt(2, vincCine.getIdVincCine());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "filme vinculado com sucesso!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no VincularCinema" + erro);
        }

    }

    public ArrayList<Cinema> TableCinema() {

        String sql = "SELECT id,nomeCinema,localizacao FROM tb_cinema";
        conn = new ConnectionFactory().obtemConexao();
        try {
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();

            while (rs.next()) {
                Cinema cine = new Cinema();
                cine.setIdCine(rs.getInt("id"));
                cine.setNomeCinema(rs.getString("nomeCinema"));
                cine.setLocalizacao(rs.getInt("localizacao"));

                listaCine.add(cine);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no TableCinema" + erro);
        }
        return listaCine;
    }

    public void armazenarDados(Usuario usuario) {
        conn = new ConnectionFactory().obtemConexao();

        try {
            String sql = "Select id,cep,nomeUsuario,email,administrador,local from tb_usuario where email = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setId(rs.getInt("id"));
                usuario.setCep(rs.getInt("cep"));
                usuario.setNomeUsuario(rs.getString("nomeUsuario"));
                usuario.setEmail(rs.getString("email"));
                usuario.setId(rs.getInt("id"));
                usuario.setAdministrador(rs.getString("administrador"));
                usuario.setLocal(rs.getInt("local"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO armazernar dados :" + erro);

        }

    }

    public void CadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO tb_usuario (nomeUsuario,cep,email,senha,administrador,local) VALUES (?,?,?,?,?,?)";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getNomeUsuario());
            pstm.setInt(2, usuario.getCep());
            pstm.setString(3, usuario.getEmail());
            pstm.setString(4, usuario.getSenha());
            pstm.setString(5, usuario.getAdministrador());
            pstm.setInt(6, usuario.getLocal());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no cadastrarUsuario" + erro);
        }

    }

    public boolean verificacaoEmail(Usuario usuario) {
        conn = new ConnectionFactory().obtemConexao();
        String emailUsado = "";
        try {
            String sql = "Select email from tb_usuario where email = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getEmail());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                emailUsado = rs.getString("email");

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO :" + erro);

        }
        System.out.println("DAO: " + emailUsado);

        if (emailUsado.equals(usuario.getEmail())) {
            return true;
        } else {
            return false;
        }

    }

    public void loading() {
        conn = new ConnectionFactory().obtemConexao();
        JTable tbl = new JTable();

        try {
            String[] title = {"First Name", "Last Name", "Picture"};
            String sql = "select * from tb_filme";

            DefaultTableModel model = new DefaultTableModel(null, title) {
                @Override
                public Class<?> getColumnClass(int column) {
                    if (column == 2) {
                        return ImageIcon.class;
                    }
                    return Object.class;
                }
            };

            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);
            Object[] fila = new Object[4];
            while (rs.next()) {
                fila[0] = rs.getString("nomeFilme");
                fila[1] = rs.getString("sinopse");
                fila[2] = rs.getString("cartaz");
                model.addRow(fila);
            }
            tbl.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void alterarFilme(Filme filme) {
        String sql = "UPDATE tb_filme SET nomeFilme = ?,cartaz = ? ,sinopse = ? ,dataLancamento = ?  WHERE id = ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, filme.getNomeFilme());
            pstm.setInt(2, filme.getCartaz());
            pstm.setString(3, filme.getSinopse());
            pstm.setString(4, filme.getDataLancamento());
            pstm.setInt(5, filme.getId());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no alterar" + erro);
        }

    }
    
     public void excluirFilmeExiste(Filme filme) {
        String sql = "DELETE FROM filme_existe_cinema WHERE idFilme= ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, filme.getId());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no excluir FilmeExiste " + erro);
        }

    }

     public void excluirFilme(Filme filme) {
        String sql = "DELETE FROM tb_filme WHERE id= ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, filme.getId());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no excluir" + erro);
        }

    }
     
      public void alterarCinema(Cinema cine) {
        String sql = "UPDATE tb_cinema SET nomeCinema = ? ,localizacao = ?  WHERE id = ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cine.getNomeCinema());
            pstm.setInt(2, cine.getLocalizacao());
            pstm.setInt(3, cine.getIdCine());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cinema alterado!");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no alterarCine" + erro);
        }


    }
    
     public void excluirCinemaExiste(Cinema cine) {
        String sql = "DELETE FROM filme_existe_cinema WHERE idCinema= ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, cine.getIdCine());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no excluir Cine Existe" + erro);
        }


    }

     public void excluirCinema(Cinema cine) {
        String sql = "DELETE FROM tb_cinema WHERE id= ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, cine.getIdCine());

            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no excluir Cine" + erro);
        }

    }
     
     
      public void alterarUsuario(Usuario usu) {
        String sql = "UPDATE tb_usuario SET nomeUsuario = ? ,cep = ?, email = ?, senha = ?  WHERE id = ?";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usu.getNomeUsuario());
            pstm.setInt(2, usu.getCep());
            pstm.setString(4, usu.getSenha());
            pstm.setString(3, usu.getEmail());
            pstm.setInt(5, usu.getId());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Usuario alterado");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no alterarUsuario" + erro);
        }


    }
      
      public void armazenarDadosFilme(Filme filme) {
        conn = new ConnectionFactory().obtemConexao();

        try {
            String sql = "SELECT id,nomeFilme,cartaz,sinopse,dataLancamento FROM tb_filme Where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, filme.getId());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                filme.setNomeFilme(rs.getString("nomeFilme"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDataLancamento(rs.getString("dataLancamento"));
                filme.setCartaz(rs.getInt("cartaz"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DAO :" + erro);

        }

    }
      
}
