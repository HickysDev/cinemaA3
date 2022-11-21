package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Administrador extends Usuario{

    DAO dao = new DAO();
    
   public void cadastrarFilme(Filme filme) {
        dao.cadastrarFilme(filme);
    }
   
    
    public void adiconarCinema(Cinema cine){
    dao.cadastrarCinema(cine);
    }
    
    public void excluirCinema(){
    
    }
    
    public void editarCinema(){
    
    }
    
    public void mostrarAdmin(){
        System.out.println(this.getNomeUsuario() + this.getCep() + this.getEmail());
    }
    
}
