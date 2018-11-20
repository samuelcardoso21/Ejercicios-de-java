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
public class Ejercicio03 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[] n = new int[10];
    Scanner s = new Scanner(System.in);
    
    System.out.print("Vaya introduciendo números hasta llegar a 10: ");
    
    for (int i = 0; i < 10; i++) {
    n[i] = Integer.parseInt(s.nextLine());
    }
    System.out.println("\nEl orden inverso de los números introducidos es: ");
    for (int i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
  }
  
}
