/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays2Dimensiones;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ejercicio08 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("Introduzca la posición del alfíl (por ej: d5): ");
    String coordenadaIntroducida = s.nextLine();
    
    int xAlfil = (int)(coordenadaIntroducida.charAt(0)) - 96;
    int yAlfil = (int)(coordenadaIntroducida.charAt(1)) - 48;
    
    System.out.println("El alfil puede moverse a las siguientes posiciones:");

    
    for (int y = 8; y >= 1; y--) {
      for (int x = 1; x <= 8; x++) {
        if ((Math.abs(yAlfil - y) == Math.abs(xAlfil - x))
               && (! ((yAlfil == y) && (xAlfil == x)))) {
          System.out.print((char)(x + 96) + "" + y + " "); 
        }
      }
    }
    
    
  }
  
}
