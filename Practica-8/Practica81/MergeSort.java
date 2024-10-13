package mx.unam.fi.poo.g1.p8;

/**
 * Clase MergeSort utilizando la interfaz Ordenamiento
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class MergeSort implements Ordenamiento {
    
    /**
     * Sobrescritura del método ordenar
     * @param arr -> Arreglo a ordenar
     */
    @Override
    public void ordenar(int [] arr){
        mergeSort(arr, 0, arr.length -1);
    }

    /**
     * Método MergeSort
     * Aplica el algoritmo MergeSort
     * @param arr -> Arreglo a ordenar
     * @param inicio -> Índice inicial
     * @param fin -> Índice final
     */
    public void mergeSort(int [] arr, int inicio, int fin){
        if(inicio < fin){
            int middle = (inicio + fin)/2;
            mergeSort(arr, inicio, middle);
            mergeSort(arr, middle +1, fin);
            merge(arr, inicio, middle, fin);
        }
    }

    /**
     * Método Merge
     * Fusiona las sublistas ordenadas
     * @param arr -> Arreglo a ordenar
     * @param inicio -> Índice inicial
     * @param middle -> índice medio
     * @param fin -> Índice final
     */
    public void merge(int[] arr, int inicio, int middle, int fin){
        int n1 = middle - inicio +1;
        int n2 = fin - middle;

        int [] izquierda = new int[n1];
        int [] derecha = new int[n2];

        for(int i = 0; i < n1; i++){
            izquierda[i] = arr[inicio + i];
        }
        for(int j = 0; j < n2; j++){
            derecha[j] = arr[middle + 1 + j];
        }

        int i = 0, j=0, k = inicio;
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                arr[k] = izquierda[i];
                i++;
            } else {
                arr[k] = derecha[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = izquierda[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = derecha[j];
            j++;
            k++;
        }
    }
}
