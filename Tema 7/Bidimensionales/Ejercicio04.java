/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2Dimensiones;


/**
 *
 * @author samuel
 */
public class Ejercicio04 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws InterruptedException {
    
    int[][] num = new int [4][5];
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
        Thread.sleep(350);
        System.out.printf("%7d   ", num[i][j]);
        sumaFila += num[i][j];
      }
      Thread.sleep(400);
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
      Thread.sleep(350);
      System.out.printf("%7d   ", sumaColumna);
    }
    Thread.sleep(500);
    System.out.printf("|%7d   \n", sumaTotal);
    
  }
  
}
