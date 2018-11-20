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
    int p;
    
    for (i = 0; i < 10; i++) {
      System.out.print("Introduzca número: ");
      n[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println("\nArray original:");
    
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
      
      if (esPrimo(n[i])) {
        ordenado[h] = n[i];
        h++;
      } else {
        ordenado[j] = n[i];
        j--;
      }
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
  
  
  public static Boolean esPrimo(int numero)
  {
      Boolean esPrimoActual = true;
      if(numero<2)
      {
          esPrimoActual = false;
      }
      else
      {
          for(int x=2; x*x<=numero; x++)
          {
              if( numero%x==0 ){esPrimoActual = false;break;}
          }
      }
      return esPrimoActual;
  }
}
