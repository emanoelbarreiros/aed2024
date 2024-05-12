package algoritmos;

import java.util.Arrays;

public class MergeSort {

    public static void ordenar(int[] valores, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = (p + r) / 2;
        ordenar(valores, p, q);
        ordenar(valores, q + 1, r);
        merge(valores, p, q, r);
    }

    public static void merge(int[] valores, int p, int q, int r) {
        int nE = q - p + 1;
        int nD = r - q;
        int[] esquerda = Arrays.copyOf(valores, nE);
        int[] direita = Arrays.copyOfRange(valores, q + 1, valores.length);

        int i = 0;
        int j = 0;
        int k = p;
        while (i < nE && j < nD) {
            if (esquerda[i] < direita[j]) {
                valores[k++] = esquerda[i++];
            } else {
                valores[k++] = direita[j++];
            }
        }

        while (i < nE) {
            valores[k++] = esquerda[i++];
        }
        while (j < nD) {
            valores[k++] = direita[j++];
        }
    }

}
