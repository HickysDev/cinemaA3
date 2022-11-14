package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Usuario {
    
    private String nomeUsuario;
    private String cep;
    private String email;
    private String senha;
    private Integer id;
    
    
    // Construtor
    public Usuario(String nomeUsuario, String cep, String email, String senha, Integer id) {
        this.nomeUsuario = nomeUsuario;
        this.cep = cep;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }


    //getters e setters
    
    
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
}
