package com.mycompany.cinema;

public class Cinema {
   private String nomeCinema;
   private String localizacao;
   private String filmesCartaz;
   
    public Cinema (String nomeCinema, String localizacao, String filmesCartaz){
       this.nomeCinema = nomeCinema;
       this.localizacao = localizacao;
       this.filmesCartaz = filmesCartaz;        
   
   }
   
    public String getNomeCinema() {
        return nomeCinema;
    }

    public void setNomeCinema(String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getFilmesCartaz() {
        return filmesCartaz;
    }

    public void setFilmesCartaz(String filmesCartaz) {
        this.filmesCartaz = filmesCartaz;
    }

}
