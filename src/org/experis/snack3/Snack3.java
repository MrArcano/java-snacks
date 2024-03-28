package org.experis.snack3;

public class Snack3 {
    public static void main(String[] args) {
        // Snack3
        // Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        int[] numbers = {11, 25, 37, 42, 56, 63, 78, 89, 91, 104};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if( i%2 == 1) sum += numbers[i];
        }

        System.out.println("La somma di tutti gli elementi nelle posizioni dispari è: " + sum);
    }
}
