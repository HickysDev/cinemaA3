package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {
    
    private String nomeUsuario;
    private String cep;
    private String email;
    private String senha;
    private String administrador;
    private Integer id;
    
    //getters e setters

    public String isAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // Fim do getters e setters
    
    public void inserir(){
        //Definir comando SQL
        String sql = "INSERT INTO tb_usuario(nomeUsuario, cep, email, senha) VALUES (?,?,?,?)";
        
        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            // Preenche os dados
            ps.setString(1, nomeUsuario);
            ps.setString(2, cep);
            ps.setString(3, email);
            ps.setString(4, senha);
            //Executar o comando
            ps.execute();
        }
        catch(Exception e){
        }
    }
    
    public void atualizar(){
    //Definir comando SQL
        String sql = "UPDATE tb_usuario SET nomeUsuario = ?, cep = ?, email = ? WHERE id = ?";
    //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nomeUsuario);
            ps.setString(2, cep);
            ps.setString(3, email);
            ps.setInt(4, id);
            
            //Executar o comando
            ps.execute();
  
        } catch(Exception e){
        
        }
    }
    
    public void deletar(){
         //Definir comando SQL
        String sql = "DELETE FROM tb_usuario WHERE id= ?";
        
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
    
    public void listar(){
         //Definir comando SQL (Mostrando todos os valores)
        String sql = "SELECT * FROM tb_usuario";
        
        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            //Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            //Mostrando a lista
            while (rs.next()){
                int id = rs.getInt("id");
                String nomeUsuario = rs.getString("nomeUsuario");
                String cep = rs.getString("cep");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                
                String aux = String.format("Id: %d, Nome: %s, Cep %s,  Email %s,  Senha %s", id, nomeUsuario, cep, email, senha);
                
                JOptionPane.showMessageDialog(null, aux);
            }
            //Executar o comando
            ps.execute();
  
        } catch(Exception e){
        
        }
    }
}
