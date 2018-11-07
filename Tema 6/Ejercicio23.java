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
public class Ejercicio23 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String nombreDado = "";
    int numeroDado;
    
    for (int i = 0; i < 5; i++) {
      numeroDado = (int) (Math.random() * 6);
      switch (numeroDado) {
        case 0:
          nombreDado = "Q";
          break;
        case 1:
          nombreDado = "J";
          break;
        case 2:
          nombreDado = "7";
          break;
        case 3:
          nombreDado = "8";
          break;
        case 4:
          nombreDado = "K";
          break;
        case 5:
          nombreDado = "As";
          break;
        default:
      }
      System.out.print(nombreDado + " ");
    }
    System.out.println("");
  }
  
}
