import java.util.Scanner;
interface Pagamento{
    double calcularPagamento();
}
abstract class Funcionario implements Pagamento{
    protected String nome;
    protected String genero;
    protected String funcao; 
    protected double salario;
    protected String horario;
    protected String cargo;
    public Funcionario(String nome, String genero, String funcao, double salario, String horario, String cargo){
        this.nome=nome;
        this.genero=genero;
        this.funcao=funcao;
        this.salario=salario;
        this.horario=horario;
        this.cargo=cargo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getgenero(){
        return genero;
    }
    public void setgenero(String genero){
        this.genero=genero;
    }
    public String getfuncao(){
        return funcao;
    }
    public void setfuncao(String funcao){
        this.funcao=funcao;
    }
    public double getsalario(){
        return salario;
    }
    public void setsalario(double salario){
        this.salario=salario;
    }
    public String gethorario(){
        return horario;
    }
    public void sethorario(String horario){
        this.horario=horario;
    }
    public String getcargo(){
        return cargo;
    }
    public void setcargo(String cargo){
        this.cargo=cargo;
    }
    public abstract void mostrarinfomacoes();
}
