package it.unimi.di.prog2.h03;

import java.util.Scanner;

public class Sommaint {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in); // ho aperto il mio scanner

        int somma = 0; 

        //finchè lo scanner ha un prossimo intero
        while (s.hasNextInt()){ //finchè la stringa di input ha degli interi 
            int x =s.nextInt(); //memorizzo un intero nella var x 
            somma=somma+x; //aggiorno la somma
        }
        s.close(); //sto chiudendo a mano lo scanner

        System.out.println(somma+ "/n");
        //per finire dopo aver fatto l'elenco faccio control D 
    }
}
