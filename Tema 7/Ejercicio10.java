/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ejercicio10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] n = new int[20];
    int[] ordenado = new int[20];
    
    for (int i = 0; i < 20; i++) {
      System.out.print("Introduzca número: ");
      n[i] = Integer.parseInt(s.nextLine());
    }
    
    int j = 19;
    int m = 0;
    for (int i = 0; i < 20; i++) {
      if (n[i] % 2 == 0) {
        ordenado[m] = n[i];
        m++;
      } else {
        ordenado[j] = n[i];
        j--;
      }
    }
    System.out.println("");
    for (int i: ordenado) {
      System.out.println(i);
    }
    
  }
  
}
