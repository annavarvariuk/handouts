package it.unimi.di.prog2.h03;
import java.util.Scanner;


public class MatriciTrasposte {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//ricavo il numero di righe(N) e di colonne (M)
        int N= Integer.parseInt(args[0]);
        int M =Integer.parseInt(args[1]);

    //creo la matrice di N righe e M colonne 
    int[][] A =new int[N][M]; 

        //serve per popolare la matrice 
        for(int r=0;r<N;r++){
            for(int c=0;c<M;c++){
                A[r][c] =s.nextInt();
            }
        }

        //come stampare la matrice
        for(int r=0;r<N;r++){
            for(int c=0;c<M;c++){
               System.out.print( A[r][c] + " ");
            }
            System.out.println();
        }

    //la matrice trasposta è una matrice nuova con M righe e N colonne
    int[][] T= new int[M][N];

    //popolo la matrice T
     for(int r=0;r<M;r++){
            for(int c=0;c<N;c++){
                T[r][c] =A[c][r];
            }
        }

    //devo stampare T
       for(int r=0;r<M;r++){
            for(int c=0;c<N;c++){
               System.out.print( T[r][c] + " ");
            }
            System.out.println();
        }


        s.close();

    }
}
