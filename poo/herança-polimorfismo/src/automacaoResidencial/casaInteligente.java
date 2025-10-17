import java.net.ServerSocket;

public class casainteligente{
    private String estruturadacasa;
    private String fachadadeblindex;
    private String telhadoverde;
    private String energiasustentavel;
    private String acessibilidade;
    public casainteligente(String estruturadacasa, String fachadadeblindex,String telhadoverde, String energiasustentavel, String acessibilidade){
        this.estruturadacasa = estruturadacasa;
        this.fachadadeblindex = fachadadeblindex;
        this.telhadoverde = telhadoverde;
        this.energiasustentavel = energiasustentavel;
        this.acessibilidade = acessibilidade;
    }
    public String getEstruturadacasa(){
        return estruturadacasa;
    }
    public void setEstruturadacasa(String estruturadacasa){
        this.estruturadacasa=estruturadacasa;
    }

    public String getFachadadeblindex(){
        return fachadadeblindex;
    }
    public void setFachadadeblindex(String fachadadeblindex){
        this.fachadadeblindex=fachadadeblindex;
    }

    public String getTelhadoverde(){
        return telhadoverde;
    }
    public void setTelhadoverde(String telhadoverde){
        this.telhadoverde=telhadoverde;
    }

    public String getEnergiasustentavel(){
        return energiasustentavel;
    }
    public void setEnergiasustentavel(String energiasustentavel){
        this.energiasustentavel=energiasustentavel;
    }
    public String getAcessibilidade(){
        return acessibilidade;
    }
    public void setAcesssibilidade(String acessibilidade){
        this.acessibilidade=acessibilidade;
    }

    public void autonomialuminosa(String acessibilidade){
        System.out.println("acionar luzes por voz e prewsença ");
    }
    public void economizarenergia(){
        System.out.println("economisa energia utilizando uma IA");
    }
}
