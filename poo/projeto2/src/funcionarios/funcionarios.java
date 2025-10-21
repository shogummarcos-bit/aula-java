package funcionarios;
public class funcionarios{
    private String nome;
    private String matricula;
    private String genero;
    public funcionarios(String nome, String matricula, String genero){
        this.nome=nome;
        this.matricula=matricula;
        this.genero=genero;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void atenderaluno(){
        System.out.println("atende o aluno");
    }
    public void orientaaluno(){
        System.out.println("orienta o aluno no horário de aula");
    }

}