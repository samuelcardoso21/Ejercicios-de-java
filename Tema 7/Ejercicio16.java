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
public class Ejercicio16 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] array = new int[20];
    
    for (int i = 0; i < 20; i++) {
      array[i] = (int) (Math.random() * 401);
    }
    
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.print("\n¿Qúe números quiere resaltar? (1- multiplos de"
            + " cinco, 2- multiplos de 7): ");
    int respuesta = Integer.parseInt(s.nextLine());
    
    if (respuesta == 1) {
      for (int i = 0; i < 20; i++) {
        if (array[i] % 5 == 0) {
          System.out.print("[");
        }
        System.out.print(array[i]);
        if (array[i] % 5 == 0) {
          System.out.print("] ");
        } else {
          System.out.print(" ");
        }
      }
    } else if (respuesta == 2) {
      for (int i = 0; i < 20; i++) {
        if (array[i] % 7 == 0) {
          System.out.print("[");
        }
        System.out.print(array[i]);
        if (array[i] % 7 == 0) {
          System.out.print("] ");
        } else {
          System.out.print(" ");
        }
      }
    } else {
      System.out.println("Introduce un número válido (1 o 2)");
    }
  }
  
}
