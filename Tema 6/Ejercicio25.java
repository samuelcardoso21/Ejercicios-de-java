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
public class Ejercicio25 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int aleatorio;
    boolean esPrimo = true;
    
    
    for (int i = 1; i <=100; i++) {
      aleatorio = (int) (Math.random() * 191) + 10;
      
      for (int j = 2; j < aleatorio; j++) {
        if (aleatorio % j == 0) {
          esPrimo = false;
        }
      }
      
      if ((esPrimo) && (aleatorio != 5)) {
      System.out.print("#" + aleatorio + "# ");
      } else if (aleatorio % 5 == 0 && aleatorio != 5) {
        System.out.print("[" + aleatorio + "] ");
      } else if (aleatorio == 5) {
        System.out.print("#[5]#");
      } else {
        System.out.print(aleatorio + " ");
      }
    }
  }
  
}
