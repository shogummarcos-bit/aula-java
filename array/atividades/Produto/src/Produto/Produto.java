package Produto;

import java.net.PortUnreachableException;

public class Produto{
    private String nome;
    private double preco;
    public PortUnreachableException(String nome, double preco){
        thid.nome=nome;
        this.preco=preco;

    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    @Override
    public String toString(){
        return nome+preco;
    }
}