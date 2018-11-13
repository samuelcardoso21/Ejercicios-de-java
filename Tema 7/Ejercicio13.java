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
public class Ejercicio13 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] n = new int[100];
    int maximo = 0;
    int minimo = 500;
    
    for (int i = 0; i < 100; i++) {
      n[i] = (int) (Math.random() * 501 );
      if (maximo < n[i]) {
        maximo = n[i];
      }
      if (minimo > n[i]) {
        minimo = n[i];
      }
    }
    
    for (int i : n) {
      System.out.print(i + " ");
    }
    
    System.out.print("\n¿Que quiere destacar? (1 - mínimo, 2 - máximo): ");
    int respuesta = Integer.parseInt(s.nextLine());
    for (int i : n) {
      if (respuesta == 1 && i == minimo) {
        System.out.print("*" + i + "* ");
      } else if (respuesta == 2 && i == maximo) {
      System.out.print("*" + i + "* ");
    } else {
        System.out.print(i + " ");
      }
    }
    
  }
  
}
