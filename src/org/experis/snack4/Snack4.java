package org.experis.snack4;

import java.util.Arrays;
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        // Snack4
        // Data in input una stringa verificare se è palindroma

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci una parola palindroma: ");
        char[] charWord = scan.nextLine().toLowerCase().toCharArray();

        boolean isPali = true;

        for (int i = 0; i < charWord.length; i++) {
            if (charWord[i] != charWord[charWord.length - 1 - i]) {
                isPali = false;
                break;
            }
        }

        System.out.println(isPali ? "Parola palindroma" : "Parola NON palindroma");
    }
}
