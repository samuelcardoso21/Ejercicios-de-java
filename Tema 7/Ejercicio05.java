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
public class Ejercicio05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[] n = new int[10];
    Scanner s = new Scanner(System.in);
    int maximo = 0;
    int minimo = 999999999;
    
    System.out.print("Vaya introduciendo números hasta llegar a 10: ");
    
    for (int i = 0; i < 10; i++) {
    n[i] = Integer.parseInt(s.nextLine());
    if (n[i] > maximo) {
      maximo = n[i];
      } else if (n[i] < minimo) {
        minimo  = n[i];
      }
    }
    System.out.println("\nLos números introducidos son:");
    
    for (int i = 0; i < 10; i++) {
      System.out.print(n[i]);
      if (n[i] == maximo) {
        System.out.print(" máximo");
      } else if (n[i] == minimo) {
        System.out.print(" mínimo");
      }
      System.out.println("");
    }
      
    
  }
  
}
