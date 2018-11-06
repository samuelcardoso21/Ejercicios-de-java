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
public class Ejercicio09 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int numero = 0;
    int i = 1;
   while (numero != 24) {
      numero = (int) (Math.random() * 51) * 2;
      System.out.println(numero);
      i++;
    } 
    System.out.println("Se han generado " + (i - 1) + " números");
  }
  
}
