package algoritmos;

public class QuickSort {

    public static void ordenar(int[] valores, int p, int r) {
        if (p < r) {
            int q = particionar(valores, p, r);
            ordenar(valores, p, q - 1);
            ordenar(valores, q + 1, r);
        }
    }

    public static int particionar(int[] valores, int p, int r) {
        int x = valores[r];
        int i = p - 1;
        int temp;

        for (int j = p; j < r; j++) {
            if (valores[j] < x) {
                i++;
                temp = valores[i];
                valores[i] = valores[j];
                valores[j] = temp;
            }
        }

        temp = valores[i + 1];
        valores[i + 1] = valores[r];
        valores[r] = temp;

        return i + 1;
    }
}
