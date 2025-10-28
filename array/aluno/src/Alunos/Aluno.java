import java.util.ArrayList;
import java.util.Collection;
public class Aluno{
    private String nome;
    private double media;
    public Aluno(String nome, double media){
        this.nome=nome;
        this.media=media;
    }
    public String getNome(){
        return nome;

    }
    public double getMedia(){
        return media;
    }
    @Override
    public String toString(){
        return nome +"- media:"+media;
    }
}