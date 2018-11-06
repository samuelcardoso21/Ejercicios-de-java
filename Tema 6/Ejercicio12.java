package tema06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class Ejercicio12 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    for (int filas = 1; filas <=120; filas++) {
      for (int columnas = 1; columnas <= 90; columnas++) {
        int caracter = (int) (Math.random() * 95) + 32;
        System.out.print((char) caracter + "");
      }
      System.out.println("");
    }
    
  }
  
}
