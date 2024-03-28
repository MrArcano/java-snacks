package org.experis.snack2;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        // Snack2
        // Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        // e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        String[] names = {"Mario", "Luigi", "Giovanni", "Anna", "Maria", "Laura", "Paolo", "Luca", "Giuseppe", "Roberto"};
        String[] lastnames = {"Rossi", "Bianchi", "Verdi", "Ferrari", "Russo", "Esposito", "Ricci", "Conti", "Gallo", "Gallo"};

        Random random = new Random();
        int listaLength = random.nextInt(100);

        for (int i = 0; i < listaLength; i++) {
            int nameId = random.nextInt(names.length);
            int lastnameId = random.nextInt(lastnames.length);
            System.out.println(names[nameId] + " " + lastnames[lastnameId]);
        }
    }
}
