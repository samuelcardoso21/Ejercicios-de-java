/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06;

/**
 *
 * @author samuel
 */
public class Ejercicio04 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    for (int contador = 0; contador < 20; contador++) {
      int numero = (int) (Math.random() * 11);
      System.out.print(numero + " ");
    }
  }
}
