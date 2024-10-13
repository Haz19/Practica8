package mx.unam.fi.poo.g1.p8;

interface Ordenamiento{
    void ordenar(int []arr);
}

class BubbleSort implements Ordenamiento{
    public void ordenar(int []arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Ordenamiento{
    public void ordenar(int[]arr){
        int n = arr.length;

        for(int i = 0; i < n -1; i++){
            int minIndex = i;
            for(int j = i +1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

/**
 * Ejercicio 0
 */
public class Ejercicio0{
    public static void main(String[] args) {
        int[] arr = {
            4, 2, 0, 3, 1, 6, 8
        };

        Ordenamiento bubble = new BubbleSort();
        bubble.ordenar(arr);
        imprime(arr);

        Ordenamiento selection = new SelectionSort();
        selection.ordenar(arr);
        imprime(arr);
    }

    public static void imprime(int [] arr){
        for(int i: arr){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}