/*

Copyright 2025 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.e03;

import java.util.Scanner;

/** Classe per la somma di importi in centesimi. */
public class SommaCentesimi {

  /** Costruttore privato per impedire l'istanziazione. */
  private SommaCentesimi() {}

  /*
   * Scrivere il metodo main che legga dal flusso di ingresso un elenco di importi in euro e
   * centesimi (uno per riga, con la parte decimale separata dalla parte intera da un punto) e ne
   * emetta nel flusso d'uscita la somma.
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double somma= 0.0;

    while(s.hasNextDouble()){
      somma=somma+s.nextDouble();
    
    }  
     s.close();
    System.out.println("la somma è: "+somma);
//viene stampato con il punto ma devo mettere come input numeri con la virgola 
//es 14,99 7,10

  }
}
