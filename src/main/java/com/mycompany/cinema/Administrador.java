package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Administrador extends Usuario{
    
    public Administrador(String nomeUsuario, String cep, String email, String senha, Integer id){
        super(nomeUsuario, cep, email, senha, id);
    }
    
    Filme f = new Filme(null);
    String nomeFilme = f.getNomeFilme();
    
    public void adicionarFilme(){
        
            //Definir comando SQL
        String sql = "INSERT INTO tb_filme(nomeFilme) VALUES (?)";
        
        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            // Preenche os dados
            ps.setString(1, nomeFilme);
            //Executar o comando
            ps.execute();
        }
        catch(Exception e){
        }
    }
    
    
    public void excluirFilme(){
    
    }
    
    public void editarFilme(){
    
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
