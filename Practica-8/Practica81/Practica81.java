package mx.unam.fi.poo.g1.p8;

import mx.unam.fi.poo.g1.p8.*;

/**
 * Clase Principal de la Practica81
 * @author Haziel Alvarez
 * @version Octubre 2024
 */
public class Practica81{
    /**
     * Metodo main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        int[] arr = {
            50, 32, 27, 9, 13, 19, 20
        };

        Ordenamiento quickSort = new Quicksort();
        System.err.println("Arreglo original: ");
        imprime(arr);

        quickSort.ordenar(arr);
        System.out.println("Por QuickSort: ");
        imprime(arr);

        int[] arr2 = {
            50, 32, 27, 9, 13, 19, 20
        };

        Ordenamiento mergeSort = new MergeSort();
        mergeSort.ordenar(arr2);
        System.out.println("Por MergeSort: ");
        imprime(arr2);
    }

    /**
     * Método estático Imprime
     * @param arr -> Arreglo a imprimir
     */
    public static void imprime(int [] arr){
        for(int i: arr){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}

