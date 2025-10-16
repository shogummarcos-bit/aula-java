import carro.Carro;
import carro.Carrobugate;
public class App {
    public static void main(String[] args) throws Exception {
        Carro carro=new Carro();
        carro.ligar();
        carro.desligar();
        carro.acelerar();
        Carrobugate carrobugate=new Carrobugate();
        carrobugate.ligar();
        carrobugate.desligar();
        carrobugate.acelerar();
    }
}
