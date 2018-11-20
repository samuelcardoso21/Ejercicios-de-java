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
public class Ejercicio01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws InterruptedException {
    
    
    int[][] num = new int [3][6];
    
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 7;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    int fila;
    int columna;
    
    System.out.print("       ");
    for(columna = 0; columna < 6; columna++) {
      System.out.print("   Columna " + columna);
    }
    for(fila = 0; fila < 3; fila++) {

      System.out.print("\nFila " + fila);
  
      for(columna = 0; columna < 6; columna++) {
        System.out.printf("%9d   ", num[fila][columna]);
        Thread.sleep(500); // retardo de medio segundo
      }
    }
    System.out.println("");
  }
  
}
