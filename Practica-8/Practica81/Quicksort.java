package mx.unam.fi.poo.g1.p8;

/**
 * Clase QuickSort utilizando la interfaz Ordenamiento
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class Quicksort implements Ordenamiento {
    
    /**
     * Sobrescritura del método ordenar
     * @param arr -> Arreglo a ordenar
     */
    @Override
    public void ordenar(int [] arr){
        quickSort(arr, 0, arr.length -1);
    }

    /**
     * Método QuickSort
     * Aplica el algoritmo QuickSort
     * @param arr -> Arreglo a ordenar
     * @param inicio -> índice inicial
     * @param fin -> índice final
     */
    public void quickSort(int[] arr, int inicio, int fin){
        if (inicio < fin){
            int pindex = particion(arr, inicio, fin);
            quickSort(arr, inicio, pindex -1);
            quickSort(arr, pindex + 1, fin);
        }
    }

    /**
     * Método Partición
     * Particiona el arreglo con un pivote
     * @param arr -> Arreglo a particionar
     * @param inicio -> Índice inicial
     * @param fin -> índice final
     * @return índice del pivote 
     */
    public int particion(int [] arr, int inicio, int fin){
        int pivote = arr[fin];
        int i = inicio -1;

        for(int j = inicio; j < fin; j++){
            if(arr[j] <= pivote){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i +1];
        arr[i +1] = arr[fin];
        arr[fin] = temp;

        return i+1;
    }
}
