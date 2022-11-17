package com.mycompany.cinema;

import java.sql.*;

public class DAO {
    public boolean existe (Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE email = ? AND senha = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection conn = factory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
          } 
    
    }
}
