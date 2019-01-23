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
public class Ejercicio06 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws InterruptedException {
    
    int[][] num = new int [6][10];
    int fila;
    int columna;
    boolean repetido;
    
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);
          
          repetido = false;
          
    
  }
  
}
