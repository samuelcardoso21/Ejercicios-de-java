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
public class Ejercicio17 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] array = new int[10];
    for (int i = 0; i < 10; i++) {
      array[i] = (int) (Math.random() * 101);
    }
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("|");
    for (int i = 0; i < 50; i++) {
      System.out.print("⎯");
    }
    System.out.println("⎯");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%3d ", array[i]);
    }
    System.out.println("|");
    int n;
    int aux = array[9];
    do {
      System.out.print("Introduce un número: ");
      n = Integer.parseInt(s.nextLine());
      for (int i = 0; i < 10; i++) {
        if (array[i] == n) {
          while (array[0] != n) {
            for (int j = 9; j > 0; j--) {
            array[j] = array[j-1];
            }
            array[0] = aux;
          }
          break;
        }
      }
    } while (array[0] != n);
    
    
  }
  
}
