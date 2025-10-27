import java.util.arrays;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        List<Funcionario> funcionarios=new ArraysList<>();
        System.out.println("quantos funcioonarios dejseja cadastrar");
        int quantidade=sc.nextInt();
        Scanner sc=new Scanner(System.in);

        for(int i =0;i<quantidade;i++){
            System.out.println("nome:");
        String nome=sc.nextLine();
        System.out.println("genero:");
        String genero=sc.nextLine();
        System.out.println("função:");
        String funcao=sc.nextLine();
        System.out.println("salario:");
        double salario=sc.nextDouble();
        System.out.println("horario:");
        String horario=sc.nextLine();
        System.out.println("cargo:");
        String cargo=sc.nextLine();
        System.out.println("fundo de garantia:");
        double fundodegarantia=sc.nextDouble();
        System.out.println("ferias:");
        double ferias=sc.nextDouble();
        System.out.println("decimoterceiro:");
        double decimoterceiro=sc.nextDouble();
        System.out.println("gratificações:");
        double gratificacoes=sc.nextDouble();

        Funcionario funcionario=new Celetista(nome, genero, funcao, salario, horario, cargo, fundodegarantia, ferias, decimoterceiro, gratificacoes);
        funcionarios.add(funcionario);

        }
        Collections.sort(funcionarios, Comparator.comparing(Funcionarios::getNome));
        System.out.println("funcionarios ordenados pro nome"); 
        

funcionario.calcularPagamento();
funcionario.mostrarinfomacoes();

sc.close();
    }
}
