public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int indiceMinimo = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[indiceMinimo]) {
					indiceMinimo = j;
				}
			}
			int temp = arr[indiceMinimo];
			arr[indiceMinimo] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arreglo = { 64, 25, 12, 22, 11 };
		System.out.println("Arreglo original:");
		imprimirArreglo(arreglo);

		selectionSort(arreglo);

		System.out.println("Arreglo ordenado con Selection Sort:");
		imprimirArreglo(arreglo);
	}

	public static void imprimirArreglo(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
