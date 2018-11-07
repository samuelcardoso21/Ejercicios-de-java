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
public class Ejercicio24 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    long numero = numeroIntroducido;
    int aux = 0;
    
// calcula la longitud del número
    int longitud = 0;
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    numero = numeroIntroducido;
            
    int posicion = (int) ((Math.random() * longitud) + 1);
    
    for (int i = 1; i < posicion; i++) {
      numero = (numero / 10);
    }
    System.out.println(longitud);
    System.out.println(posicion);
    System.out.println((numero % 10));
    
  }
  
}
