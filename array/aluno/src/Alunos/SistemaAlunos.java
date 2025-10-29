package Alunos;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class SistemaAlunos{
    private List<Aluno> aluno;
    public SistemaAlunos(){
    aluno=new ArrayList<>();
}
public void adicionarAluno(String nome, double media){
    aluno.add(new Aluno(nome, media));
}
public void ListarAlunos(){
    for(Aluno a:aluno){
        System.out.println(a);
    }
}
public void removerAluno(String nome){
    aluno.removeIf(a -> a.getNome().equals(nome));
}
public int getTotalAlunos(){
     return aluno.size();
}
}