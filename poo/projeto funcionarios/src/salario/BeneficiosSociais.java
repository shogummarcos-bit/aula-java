interface Pagamento {
    double calcularPagamento();
}

public interface BeneficiosSociais {
    void setFundodegarantia(double fundodegarantia);
    double getFundodegarantia();

    void setFerias(double ferias);
    double getFerias();

    void setDecimoterceiro(double decimoterceiro);
    double getDecimoterceiro();

    void setPromocao(double promocao);
    double getPromocao();

    void setLicencamaternidade(double licencamaternidade);
    double getLicencamaternidade();

    void setLicenciapremio(double licenciapremio);
    double getLicenciapremio();

    void setGratificacoes(double gratificacoes);
    double getGratificacoes();
}

abstract class Funcionario implements Pagamento {
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

