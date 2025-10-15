import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = null;
        int opcao;

        do {
            System.out.println("\n====== MENU DE ESTOQUE ======");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Adicionar estoque");
            System.out.println("3 - Remover estoque");
            System.out.println("4 - Calcular valor total do estoque");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                   

                case 2:
                   

                case 3:
                   

                case 4:
                   

                case 5:
                    break;

                default:
            }
        } while (opcao != 5);

        sc.close();
    }
}
