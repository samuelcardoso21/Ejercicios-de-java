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
public class Ejercicio06 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[] n = new int[15];
    int i;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Vaya introduciendo números hasta llegar a 15:");
    
    for (i = 0; i < 15; i++) {
    n[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("Array original:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", n[i]);
      }
      System.out.println("|");
      
      System.out.println("Array rotado a la derecha:");
      
      int aux = n[14];
      for (i = 14; i > 0; i--) {
        n[i] = n[i-1];
      }
      n[0] = aux;
      
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", n[i]);
      }
    
  }
  
}
