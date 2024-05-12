package algoritmos;

import java.util.Arrays;

public class TestaInsertionSort {

    public static void main(String[] args) {
        int[] v = {5,1,2,3,7,4,0};

        System.out.println(Arrays.toString(v));

        InsertionSort.ordenar(v);

        System.out.println(Arrays.toString(v));
    }
}
