/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2Dimensiones;

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
    
    int[][] num = new int [4][5];
    Scanner s = new Scanner(System.in);
    int sumaFila;
    int sumaColumna;
    int total = 0;
    
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        num[i][j] = (int) (Math.random() * 900) + 100;
      }
    }
    
    for(int i = 0; i < 4; i++) {
      sumaFila = 0;
      for(int j = 0; j < 5; j++) {
        System.out.printf("%7d   ", num[i][j]);
        sumaFila += num[i][j];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    for(int j = 0; j < 5; j++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    
    int sumaTotal = 0;
    for(int j = 0; j < 5; j++) {
      sumaColumna = 0;
      for(int i = 0; i < 4; i++) {
        sumaColumna += num[i][j];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   \n", sumaTotal);
    
  }
  
}
