package com.mycompany.cinema;

import java.sql.*;
import javax.swing.JOptionPane;

public class DAO {

    Connection conn;

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
        System.out.println("DAO: "+adminisradorValido);
        
        if (adminisradorValido.equals("1")) {
            return true;
        } else {
            return false;
        }

    }
}
