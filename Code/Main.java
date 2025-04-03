import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 2, 7, 28, 90, 100, 1290, 4, 76, 21};
        System.out.println("Array antes da ordenação: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Array após a ordenação: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int esq, int dir) {
        if (esq < dir) {
            int part = particao(array, esq, dir);
            quickSort(array, esq, part - 1);
            quickSort(array, part + 1, dir);
        }
    }

    private static int particao(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int part = inicio - 1;
        for (int i = inicio; i < fim; i++) {
            if (array[i] < pivot) {
                part++;
                swap(array, part, i);
            }
        }
        part++;
        swap(array, part, fim);
        return part;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
