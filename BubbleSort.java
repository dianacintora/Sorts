public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        bubbleSort(arreglo);

        System.out.println("Arreglo ordenado con Bubble Sort:");
        imprimirArreglo(arreglo);
    }

    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
