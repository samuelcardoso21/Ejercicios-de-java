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
public class Ejercicio07 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] aleatorio = new int[100];
    int valor1;
    int valor2;
    
    for (int i = 0; i < 100; i++) {
      aleatorio[i] = (int) (Math.random() * 21);
      System.out.print(aleatorio[i] + " ");
    }
    System.out.print("\nIntroduzca el valor que quiera sustituir en la lista: ");
    valor1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
    valor2 = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < 100; i++) {
      if (aleatorio[i] == valor1) {
        aleatorio[i] = valor2;
      }
      System.out.print(aleatorio[i] + " ");
    }
  }
  
}
