package org.experis.snack1;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        // Snack1
        // Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20.
        // Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido.

        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.print("Inserisci un numero PARI compreso tra 10 e 20 - ");
            number = Integer.parseInt(scan.nextLine());
        }while (number < 10 || number > 20 || number % 2 != 0);

        System.out.println("Hai inserito il numero " + number + ". CORRETTO!");

    }
}
