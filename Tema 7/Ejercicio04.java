/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

/**
 *
 * @author samuel
 */
public class Ejercicio04 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int[] numero = new int [20];
    int[] cuadrado = new int [20];
    int[] cubo = new int [20];
    
    System.out.println(" N:   N²:     N³:");
    for (int i = 0; i < 20; i++) {
      numero[i] = (int) (Math.random() * 101);
      System.out.printf("%3d ", numero[i]);
      cuadrado[i] = (numero[i] * numero[i]);
      System.out.printf("%5d ", cuadrado[i]);
      cubo[i] = (numero[i] * numero[i] * numero[i]);
      System.out.printf("%7d \n", cubo[i]);
      
    }
    
  }
  
}
