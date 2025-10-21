import funcionarios.funcionarios;
import funcionarios.orientadoreducacional;

public class App {
    public static void main(String[] args) throws Exception {
orientadoreducacional orientador1=new orientadoreducacional("Stefanea","5554", "feminino","8 as 18 horas");
orientador1.atenderaluno();
orientador1.adverteoaluno();
orientador1.orientaaluno();
    }
}