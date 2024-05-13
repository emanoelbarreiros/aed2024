package algoritmos;

import java.util.Arrays;

public class TesteHeapSort {

    public static void main(String[] args) {
        int[] v = {5,1,2,3,7,4,0,6};

        System.out.println(Arrays.toString(v));

        Heap h = new Heap(v);
        HeapSort.ordenar(h);

        int[] novoV = h.getValores();
        System.out.println(Arrays.toString(novoV));
    }

}
