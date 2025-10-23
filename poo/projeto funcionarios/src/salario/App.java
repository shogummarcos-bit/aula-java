interface Pagamento {
    double calcularPagamento();
}



abstract class Funcionario implements Pagamento, BeneficiosSociais {
    protected String nome;
    protected String genero;
    protected String funcao;
    protected double salario;
    protected String horario;
    protected String cargo;

    public Funcionario(String nome, String genero, String funcao, double salario, String horario, String cargo) {
        this.nome = nome;
        this.genero = genero;
        this.funcao = funcao;
        this.salario = salario;
        this.horario = horario;
        this.cargo = cargo;
    }

    public abstract void mostrarinfomacoes();
}

class Celetista extends Funcionario  {
    private double fundodegarantia;
    private double ferias;
    private double decimoterceiro;
    private double licencamaternidade;
    private double licenciapremio;
    private double gratificacoes;
    private double promocao;

    public Celetista(String nome, String genero, String funcao, double salario, String horario, String cargo,
                     double fundodegarantia, double ferias, double decimoterceiro, double gratificacoes) {
        super(nome, genero, funcao, salario, horario, cargo);
        this.fundodegarantia = fundodegarantia;
        this.ferias = ferias;
        this.decimoterceiro = decimoterceiro;
        this.gratificacoes = gratificacoes;
    }

    @Override
    public double calcularPagamento() {
        double valorbruto = salario + ferias + decimoterceiro + gratificacoes;
        double valorliquido = valorbruto - fundodegarantia;
        System.out.println("Valor bruto: " + valorbruto);
        System.out.println("Valor líquido: " + valorliquido);
        return valorliquido;
    }

    @Override
    public void mostrarinfomacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Função: " + funcao);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Férias: " + ferias);
        System.out.println("Décimo terceiro: " + decimoterceiro);
        System.out.println("Gratificações: " + gratificacoes);
    }

    // Implementações dos métodos da interface BeneficiosSociais
    public void setFundodegarantia(double fundodegarantia) { this.fundodegarantia = fundodegarantia; }
    public double getFundodegarantia() { return fundodegarantia; }
    public void setFerias(double ferias) { this.ferias = ferias; }
    public double getFerias() { return ferias; }
    public void setDecimoterceiro(double decimoterceiro) { this.decimoterceiro = decimoterceiro; }
    public double getDecimoterceiro() { return decimoterceiro; }
    public void setPromocao(double promocao) { this.promocao = promocao; }
    public double getPromocao() { return promocao; }
    public void setLicencamaternidade(double licencamaternidade) { this.licencamaternidade = licencamaternidade; }
    public double getLicencamaternidade() { return licencamaternidade; }
    public void setLicenciapremio(double licenciapremio) { this.licenciapremio = licenciapremio; }
    public double getLicenciapremio() { return licenciapremio; }
    public void setGratificacoes(double gratificacoes) { this.gratificacoes = gratificacoes; }
    public double getGratificacoes() { return gratificacoes; }
}

public class App {
    public static void main(String[] args) {
        Celetista funcionario1 = new Celetista(
                "Maria", "Feminino", "Chefe de RH",
                5500.00, "8:00 às 17:00", "Chefe de RH",
                550.00, 5500.00, 2750.00, 1500.00
        );

        funcionario1.calcularPagamento();
        funcionario1.mostrarinfomacoes();
    }
}
