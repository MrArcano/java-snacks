package org.experis.snack6;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        // Snack 6
        // Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata nel formato “hh:mm:ss”

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci i secondi da convertire: ");
        int seconds = Integer.parseInt(scan.nextLine());

        int ore = seconds / 3600;
        int minuti = (seconds % 3600) / 60;
        int secondi = seconds % 60;

        System.out.printf("%02d:%02d:%02d%n", ore, minuti, secondi);
    }
}
