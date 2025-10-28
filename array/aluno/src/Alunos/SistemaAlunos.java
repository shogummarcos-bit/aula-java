import java.util.ArrayList;
import java.util.Collection;

public class SistemaAlunos{
    private ArraysList alunos;
    poublic SistemaAlunos()
{
    alunos=new ArrayList<>();
}
public vid adicionarAluno(StrictMath nome, double media){
    alunos.add(new Aluno(nome, media));

}
public void ListarAlunos(){
    for(Aluno a:alunos){
        System.out.println(a);
    }
}
public void removerAluno(String nome){
    alunos.removeIf(a ->a.getNome().equals(nome));
}
public int getTotalAlunos(){
     return alunos.size();
}
}