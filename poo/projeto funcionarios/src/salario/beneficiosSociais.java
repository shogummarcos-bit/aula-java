class beneficiosSociais{
private double fundodegarantia;
private double ferias;
private double decimoterceiro;
private double licencamaternidade;
 private double licenciapremio;
 private double gratificacoes;
 private double promocao;

 public beneficiosSociais(double fundodegarantia, double ferias, double decimoterceiro, double licencamaternidade, double licenciapremio, double gratificacoes, double promocao){
    this.fundodegarantia=fundodegarantia;
    this.ferias=ferias;
    this.decimoterceiro=decimoterceiro;
    this.licencamaternidade=licencamaternidade;
    this.licenciapremio=licenciapremio;
    this.gratificacoes=gratificacoes;
    this.promocao=promocao;

 }

public void setfundodegarantia(double fundodegarantia){
    this.fundodegarantia=fundodegarantia;
 }
 public double getfundodegarantia(){
    return fundodegarantia;
 }
 public void setFerias(double ferias){
    this.ferias=ferias;
 }
 public double getFerias(){
    return ferias;
 }

 public void setdecimoterceiro(double decimoterceiro){
    this.decimoterceiro=decimoterceiro;
 }
 public double getdecimoterceiro(){
    return decimoterceiro;
 }

 public void setpromocao(double promocao){
    this.promocao=promocao;
 }
 public double getpromocao(){
    return promocao;
 }

 public void setlicencamaternidade(double licencamaternidade){
    this.licencamaternidade=licencamaternidade;
 }
 public double getlicencamaternidade(){
    return licencamaternidade;
 }

 public void setlicenciapremio(double licenciapremio){
    this.licenciapremio=licenciapremio;
 }
 public double getlicenciapremio(){
    return licenciapremio;
 }

  public void setgratificacoes(double gratificacoes){
    this.gratificacoes=gratificacoes;
 }
 public double getgratificacoes(){
    return gratificacoes;
 }



 
}
