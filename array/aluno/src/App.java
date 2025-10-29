import Alunos.SistemaAlunos;
public class App {
    public static void main(String[] args) throws Exception {
        SistemaAlunos Sistema=new SistemaAlunos();
        Sistema.adicionarAluno("pedro",8.5);
        Sistema.adicionarAluno("laura",10);
        Sistema.adicionarAluno("carla",9.5);
        System.out.println("total:"+Sistema.getTotalAlunos());
        Sistema.ListarAlunos();
    }
}
