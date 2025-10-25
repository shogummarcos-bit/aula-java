import java.util.Arrays;
public class atividade4 {
    public static void main(String[] args) {
        int[] numeros={5,4,2,1,3,};
        System.out.println(numeros);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int indice=Arrays.binarySearch(numeros,4);   
    System.out.println(indice);
    }
}
