
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Funcionario funcionario=null;
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

        funcionario=new Celetista(nome, genero, funcao, salario, horario, cargo, fundodegarantia, ferias, decimoterceiro, gratificacoes);

       // Celetista funcionario1=new Celetista("Maria", "feminino","chefe de RH",5500.00, "8:00 as 17:00", "chefe de RH", 550.00, 5500.00, 2750.00, 1500.00);
funcionario.calcularPagamento();
funcionario.mostrarinfomacoes();

sc.close();
    }
}
