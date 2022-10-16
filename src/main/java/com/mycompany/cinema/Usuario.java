package com.mycompany.cinema;

public class Usuario {
    private String nomeUsuario;
    private String cep;
    private String email;
    private boolean tipoUsuario;

    public Usuario(String nomeUsuario, String cep, String email, boolean tipoUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.cep = cep;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
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

    public boolean isTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(boolean tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    
}
