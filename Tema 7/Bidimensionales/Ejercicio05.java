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
public class Ejercicio05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[][] num = new int [6][10];
    int minimo = 1000;
    int maximo = 0;
    int xMaximo = 0;
    int yMaximo = 0;
    int xMinimo = 0;
    int yMinimo = 0;
    
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = (int) (Math.random() * 1001);
        if (maximo < num[i][j]) {
          maximo = num[i][j];
          xMaximo = j;
          yMaximo = i;
        }
        if (minimo > num[i][j]) {
          minimo = num[i][j];
          xMinimo = j;
          yMinimo = i;
        }
      }
    }
      
      for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 10; j++) {
          System.out.printf("%7d   ", num[i][j]);
        }
        System.out.println("");
      }
    
    System.out.println("\nEl número máximo se encuentra en la columna "
                + xMaximo + " fila " + yMaximo);
    System.out.println("El número mínimo se encuentra en la columna "
                + xMinimo + " fila " + yMinimo);
    
  }
  
}
