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
public class Ejercicio13 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int dado1 = 0;
    int dado2 = 1;
    int i = 0;
    while (dado1 != dado2) {
      if (i > 0) {
        System.out.println("Volveré a tirar los dados...");
      }
      dado1 = (int) (Math.random() * 6) + 1;
      dado2 = (int) (Math.random() * 6) + 1;
      System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2);
      i++;
    }
    System.out.println("Ha salido el mismo número en los dos dados");
  }
  
}
