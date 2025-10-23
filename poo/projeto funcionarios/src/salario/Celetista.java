class Celetista extends Funcionario, beneficiosSociais{
    public Celetista(String nome, String genero, String funcao, double salario, String horario, String cargo, double fundodegarantia, double ferias, double decimoterceiro, double licencamaternidade, double licenciapremio, double gratificacoes, double promocao){
        super(nome, genero, funcao, salario, horario, cargo, fundodegarantia, ferias, decimoterceiro, licencamaternidade, licenciapremio, gratificacoes, promocao);
    }
    @Override
    public void calcularPagamento(double salario, double ferias, double decimoterceiro, double gratificacoes){
        double  valorbruto=salario+ferias+decimoterceiro+gratificacoes;
        double valorliquido=valorbruto-fundodegarantia;
        System.out.println("valor bruto:"+valorbruto);
        System.out.println("vaor liquido:"+valorliquido);
    }
}