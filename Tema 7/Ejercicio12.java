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
public class Ejercicio12 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca 10 números separados por INTRO");
    
    
    int[] n = new int[10];
    int i;
    
    
    for (i = 0; i < 10; i++) {
    n[i] = Integer.parseInt(s.nextLine());
    }
    
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
    System.out.print("\nIntroduzca posición inicial: ");
    int nInicial = Integer.parseInt(s.nextLine());
    if (nInicial < 0 || nInicial > 9) {
      System.out.println("La posición inicial debe estar entre 0 y 9");
      System.out.print("Vuelva a introducir la posición inicial: ");
      nInicial = Integer.parseInt(s.nextLine());
    }
    System.out.print("Introduzca posición final: ");
    int nFinal = Integer.parseInt(s.nextLine());
    if (nFinal < 0 || nFinal > 9 || nFinal < nInicial) {
      System.out.print("La posición final debe estar entre 0 y 9");
      System.out.println(" y debe ser mayor que la posición inicial");
      System.out.print("Vuelva a introducir la posición final: ");
      nFinal = Integer.parseInt(s.nextLine());
    }
    System.out.println("\nArray final:");

    int aux = n[9];
    for (i = 9; i > 0; i--) {
      if (i == nFinal) {
        i = nInicial;
      }
      if (i == nInicial) {
        n[nFinal] = n[nInicial];
      }
      n[i] = n[i-1];
    }
    
    n[0] = aux;


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

    
    
  }
  
}
