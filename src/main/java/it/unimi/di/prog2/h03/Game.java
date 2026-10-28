package it.unimi.di.prog2.h03;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int età =s.nextInt();
        s.close();

        int fascia;
        if (età <7){
            fascia= 3;
        }else if (età < 12){
            fascia= 7;
        }else if (età<16){
            fascia=12;
        }else if (età<18){
            fascia =16;
        }else{
            fascia=18;
        }
        System.out.println("fascia "+fascia);
    }
}
