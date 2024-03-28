package org.experis.snack5;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        // Snack5
        // Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        char[] arrayText = scan.nextLine().toCharArray();
        int charCounter = 0, numberCounter = 0, otherCounter = 0;
        for (int i = 0; i < arrayText.length; i++) {
            if(Character.isAlphabetic(arrayText[i])){
                charCounter++;
            }else if(Character.isDigit(arrayText[i])) {
                numberCounter++;
            }else{
                otherCounter++;
            }
        }

        System.out.println("Caratteri Alfabetici: " + charCounter);
        System.out.println("Caratteri Numerici: " + numberCounter);
        System.out.println("Altri Caratteri: " + otherCounter);
    }
}
