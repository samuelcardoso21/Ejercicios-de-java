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
public class Ejercicio14 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String[] color = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", 
      "blanco", "morado"
    };
    String[] palabra = new String[8];
    String[] resultado = new String[8];
    
    System.out.println("Introduce 8 palabras separadas por INTRO");
    int h = 0;
    int p = 7;
    int j;
    for (int i = 0; i < 8; i++) {
      palabra[i] = s.nextLine();
    }
      for (int i = 0; i < 8; i++) {
        for (j = 0; j < 9; j++) {
          if (palabra[i].equals (color[j])) {
            resultado[h] = palabra[i];
            h++;
          } 
        } 
        if (h == 0) {
          if (resultado[h] != palabra[i]) {
            resultado[p] = palabra[i];
            p--;
          }
        } else if (resultado[h - 1] != (palabra[i])) {
          resultado[p] = palabra[i];
          p--;
        }
      }
      
    
    System.out.println("\nArray original:");
    for (int i = 0; i < 8; i++) {
        System.out.printf("|%10d ", i);
      }
      System.out.println("|");
      for (int i = 0; i < 95; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (int i = 0; i < 8; i++) {
        System.out.printf("|%10s ", palabra[i]);
      }
    System.out.println("");
    
    System.out.println("\nArray final:");
    for (int i = 0; i < 8; i++) {
        System.out.printf("|%10d ", i);
      }
      System.out.println("|");
      for (int i = 0; i < 95; i++) {
        System.out.print("⎯");
      }
      System.out.println("⎯");
      for (int i = 0; i < 8; i++) {
        System.out.printf("|%10s ", resultado[i]);
      }
    System.out.println("|");
    
    
  }
  
}
