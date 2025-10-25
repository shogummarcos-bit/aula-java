import java.util.Arrays;

public class atividade6 {
    public static void main(String[] args) {
        int[] Original ={4,3,1,2,5};
        int[] copia=Arrays.copyOf(Original,Original.length);
        System.out.println(Arrays.toString(copia));
        int[] parte=Arrays.copyOf(Original,4);
        System.out.println(Arrays.toString(parte));
    }
}