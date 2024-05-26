package algoritmos;

import java.util.Arrays;

public class TesteCountingSort {

    public static void main(String[] args) {
        int[] v = {5,1,2,3,9,4,0};

        int[] resultado = CountingSort.ordenar(v);

        System.out.println(Arrays.toString(resultado));
    }

}
