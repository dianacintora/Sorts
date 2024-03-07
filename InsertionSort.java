public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			// Mover los elementos del arreglo que son mayores que la llave
			// a una posición adelante de su posición actual
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };
		System.out.println("Arreglo original:");
		imprimirArreglo(arreglo);

		insertionSort(arreglo);

		System.out.println("Arreglo ordenado con Insertion Sort:");
		imprimirArreglo(arreglo);
	}

	public static void imprimirArreglo(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
