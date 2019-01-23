/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicio02;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ejercicio02 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Coche miCoche = new Coche("Ford", "Focus", "Azul", 2005);
    Bicicleta miBici = new Bicicleta("Roja", 2016);
    
    int n = 0;
    while (n != 8) {
      System.out.println("    VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8):");

      Scanner s = new Scanner(System.in);
      n = Integer.parseInt(s.nextLine());
      
      switch (n) {
        case 1:
          
          break;
          
        case 2:
          
          break;
          
        case 3:
          
          break;
          
        case 4:
          
          break;
          
        case 5:
          
          break;
          
        case 6:
          
          break;
          
        case 7:
          
          break;
        case 8:
          break;
        default:
          System.out.println("Introduzca un número válido entre 1 y 8");
          break;
      }
    }
    
  }
  
}
