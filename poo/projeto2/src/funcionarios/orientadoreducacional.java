package funcionarios;
public class orientadoreducacional extends funcionarios{
    String horario;
    public orientadoreducacional(String nome, String matricula, String genero, String horario){
        super(nome, matricula, genero);
        this.horario=horario;
    }
    public void adverteoaluno(){
        System.out.println("emitie advetencia verbal e por escrita para o aluno");

    }

}
