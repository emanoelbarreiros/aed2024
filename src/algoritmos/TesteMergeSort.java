package algoritmos;

import java.util.Arrays;

public class TesteMergeSort {

    public static void main(String[] args) {
        int[] v = {5,1,2,3,7,4,0,6};

        System.out.println(Arrays.toString(v));

        MergeSort.ordenar(v, 0, v.length - 1);

        System.out.println(Arrays.toString(v));
    }

}
