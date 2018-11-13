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
public class Ejercicio11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] n = new int[10];
    int[] ordenado = new int[10];
    int i;
    boolean esPrimo = false;
    int p;
    
    for (i = 0; i < 10; i++) {
      System.out.print("Introduzca número: ");
      n[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("");
    
    System.out.println("Array original:");
      for (i = 0; i < 10; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 50; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 10; i++) {
        System.out.printf("|%3d ", n[i]);
      }
     
      
      System.out.println("|");
      System.out.println("");
      System.out.println("Array final");
    int j = 9;
    int h = 0;
    for (i = 0; i < 10; i++) {
      esPrimo = true;
      for (p = 2; p < n[i] - 1; p++) {
        if (n[i] % p == 0) {
          esPrimo = false;
        }
      }      
    } 
      if (esPrimo) {
        ordenado[h] = n[i];
        h++;
      } else {
          ordenado[j] = n[i];
          j--;
      }
    
    
      for (i = 0; i < 10; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 50; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (i = 0; i < 10; i++) {
        System.out.printf("|%3d ", ordenado[i]);
      }
      System.out.println("|");
      
      
  }
  
}
