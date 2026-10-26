package it.unimi.di.prog2.h03;

import java.util.Scanner;

public class StringapiùLunga {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String piùLunga= null; 
        int maxLunghezza= -1;

        while( s.hasNext()){
            String corrente= s.next();
            if (corrente.length()>maxLunghezza){
                maxLunghezza=corrente.length();
                piùLunga=corrente; 
            }
        }
System.out.println(piùLunga);
        s.close();
    }
}
