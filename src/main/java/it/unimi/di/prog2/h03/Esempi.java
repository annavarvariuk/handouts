package it.unimi.di.prog2.h03;

import java.util.List;
import java.util.ArrayList;


public class Esempi {

    public static void main(String[] args) {
        /*vanno importate le librerie */
        List<String> parole = new ArrayList<String>();
        parole.add("mamma");
        parole.add("mamma");
        parole.get(0); //recupera l'elemento ma non lo stampa
        IO.println(parole.get(0));

    }
}
