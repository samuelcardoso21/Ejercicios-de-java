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
    
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    int km;
    while (opcion != 8) {
      System.out.println("====================================");
      System.out.println("    MENÚ");
      System.out.println("====================================");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");

      
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          System.out.print("Introduce los km que quieres recorrer: ");
          km = Integer.parseInt(s.nextLine());
          miBici.recorre(km);
          System.out.println("Recorres " + km + " kms con la bicicleta");
          break;
          
        case 2:
          miBici.caballito();
          break;
          
        case 3:
          System.out.print("Introduce los km que quieres recorrer: ");
          km = Integer.parseInt(s.nextLine());
          miCoche.recorre(km);
          System.out.println("Recorres " + km + " kms con el coche");
          break;
          
        case 4:
          miCoche.quemaRueda();
          break;
          
        case 5:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(miBici.getKilometrosRecorridos());
          System.out.println(" kms");
          break;
          
        case 6:
          System.out.print("El coche lleva recorridos ");
          System.out.println(miCoche.getKilometrosRecorridos());
          System.out.println(" kms");
          break;
          
        case 7:
          System.out.print("Llevas recorrido en total ");
          System.out.println(Vehiculo.getKilometrosTotales());
          System.out.println(" kms");
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
