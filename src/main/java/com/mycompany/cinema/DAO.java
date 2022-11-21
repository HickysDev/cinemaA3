package com.mycompany.cinema;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO {

    Connection conn;
    PreparedStatement pstm;
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
            JOptionPane.showMessageDialog(null, "DAO :" + erro);
            return null;
        }

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
            JOptionPane.showMessageDialog(null, "DAO :" + erro);

        }
        System.out.println("DAO: " + adminisradorValido);

        if (adminisradorValido.equals("1")) {
            return true;
        } else {
            return false;
        }

    }

    public void cadastrarFilme(Filme filme) {
        String sql = "INSERT INTO tb_filme (nomeFilme,cartaz) VALUES (?,?)";

        conn = new ConnectionFactory().obtemConexao();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, filme.getNomeFilme());
            pstm.setInt(2, filme.getCartaz());

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
    ArrayList<Cinema> listaCine = new ArrayList<>();

    public ArrayList<Filme> TableFilme() {
        
        String sql = "SELECT id,nomeFilme,cartaz FROM tb_filme";
        conn = new ConnectionFactory().obtemConexao();
        try {
            pstm = conn.prepareStatement(sql);

            rs = pstm.executeQuery();
            
            while(rs.next()){
            Filme filme = new Filme();
            filme.setId(rs.getInt("id"));
            filme.setNomeFilme(rs.getString("nomeFilme"));
            filme.setCartaz(rs.getInt("cartaz"));
            
            listaFilme.add(filme);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "deu ruim no tablefilme" + erro);
        }
        return listaFilme;
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
            
            while(rs.next()){
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
}
