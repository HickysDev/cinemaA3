package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Administrador extends Usuario{
    
    Filme f = new Filme();
    String nomeFilme = f.getNomeFilme();
    Boolean cartaz = f.getCartaz();
    Integer id = f.getId();
    
    public void adicionarFilme(){
        
            //Definir comando SQL
        String sql = "INSERT INTO tb_filme(nomeFilme, cartaz) VALUES (?, ?)";
        
        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            // Preenche os dados
            ps.setString(1, nomeFilme);
            ps.setBoolean(2, cartaz);
            //Executar o comando
            ps.execute();
        }
        catch(Exception e){
        }
    }
    
    
    public void excluirFilme(){
     //Definir comando SQL
        String sql = "DELETE FROM tb_filme WHERE id= ?";
        
        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            //Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            
            //Executar o comando
            ps.execute();
  
        } catch(Exception e){
        
        }
    }
    
    public void editarFilme(){
            String sql = "UPDATE tb_filme SET nomeFilme = ?, cartaz = ? WHERE id = ?";
    //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nomeFilme);
            ps.setBoolean(2, cartaz);
            ps.setInt(3, id);
            
            //Executar o comando
            ps.execute();
  
        } catch(Exception e){
        
        }
    }
    
    public void adiconarCinema(){
    
    }
    
    public void excluirCinema(){
    
    }
    
    public void editarCinema(){
    
    }
    
    public void mostrarAdmin(){
        System.out.println(this.getNomeUsuario() + this.getCep() + this.getEmail());
    }
    
}
