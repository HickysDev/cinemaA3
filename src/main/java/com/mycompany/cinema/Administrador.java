package com.mycompany.cinema;

public class Administrador extends Usuario{
    
    public Administrador(String nomeUsuario, String cep, String email){
        super(nomeUsuario, cep, email);
    }
    
    public void adicionarFilme(){
    
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
