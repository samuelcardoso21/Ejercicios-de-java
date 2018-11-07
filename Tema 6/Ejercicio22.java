/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ejercicio22 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    System.out.print("Introduce la longitud de la serpiente: ");
    Scanner s = new Scanner(System.in);
    int longitud = Integer.parseInt(s.nextLine());
    int serpenteo;
    
    // cabeza
    System.out.println("            @");
    
    for (int i = 1; i < longitud; i++) {
      int espacios = 12;
      serpenteo = (int) (Math.random() * 3);
      switch (serpenteo) {
        case 0:
          espacios--;
          break;
        case 1:
          break;
        case 2:
          espacios++;
          break;
        default:
      }
      // espacios
      for (int j = 1; j <= espacios; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    
    
    
  }
  
}
