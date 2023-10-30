package org.generation.SALDP8;

import java.util.Arrays;
import java.util.Scanner;

public class SALPD8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        //Ciclo for pa meter los elementos en el array
        for(int i = 0; i < 10; i++){
            System.out.print("Introduce un número: ");
            a[i] = sc.nextInt();
        }
        //Muestro el array original
        System.out.println("Array original: " + Arrays.toString(a));
        //Creo un array de ordenamiento
        int[] ord = new int[10];
        //Defino variable K como posicion de inicio
        int k = 0;
        //Array para mostrar lo numeros primos
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                ord[k] = a[i];
                k++;
            }
        }
        //array el cual especifica con una negacion != si el numero no es primo lo agrega 
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 != 0) {
                ord[k] = a[i];
                k++;
            }
        }
        //Cierro el scanner y muestro los numeros ordenados
        sc.close();
        System.out.println("Números Ordenados: " + Arrays.toString(ord));
    }
}