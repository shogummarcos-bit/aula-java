package com.atividadejava.demo.Cliente;

public class 
Cliente{
    private string nome;
    private int idades;
    private String rmail;
    public Cliente(){}
    public Cliente(String nome, int idades, String email){
        this.nome=nome;
        this.idades=idades;
        this.email=email;
    }
    public String getNome(){
        return nome;

    }
    public void setNome(String nome){
        this.nome=nome;

    }

    public int getIdades(){
        return idades;

    }
    public void setIdades(int idades){
        this.idades=idades;
        
    }

    public String getEmail(){
        return email;

    }
    public void setEmail(String email){
        this.email=email;
        
    }

    @Override
    public String toString(){
        return "Cliente{"+"nome='"+nome+'\''+
        "idade='"+idades+'\'' + "email='"+email+'\'' +'}';
    }
}