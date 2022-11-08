package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Usuario {
    
    private String nomeUsuario;
    private Integer cep;
    private String email;

    // Construtor
    public Usuario(String nomeUsuario, Integer cep, String email) {
        this.nomeUsuario = nomeUsuario;
        this.cep = cep;
        this.email = email;
    }

    //getters e setters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
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
        String sql = "INSERT INTO tb_usuario(nomeUsuario, cep, email) VALUES (?,?,?)";
        
        //Abrir conexao com o db
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection c = factory.obtemConexao()){
            // Compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            // Preenche os dados
            ps.setString(1, nomeUsuario);
            ps.setInt(2, cep);
            ps.setString(3, email);
            
            //Executar o comando
            ps.execute();
        }
        catch(Exception e){
        }
    }
    
}
