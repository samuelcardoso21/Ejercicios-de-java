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
public class Ejercicio09 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] n = new int[8];
    
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduzca número: ");
      n[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("\nHa introducido los siguientes números:");
    for (int i : n) {
      System.out.print(i + " ");
      if (i % 2 == 0) {
        System.out.println("par");
      } else {
        System.out.println("impar");
      }
    }
      
  }
  
}
