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
public class Ejercicio06 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Acabo de pensar en un número del 0 al 100");
    int numeroPensado = (int) (Math.random() * 101);
    Scanner s = new Scanner(System.in);
    for (int oportunidades = 1; oportunidades < 6; oportunidades++) {
      System.out.println("Intento " + oportunidades + "/5");
      System.out.print("Adivina el número que estoy pensado: ");
      int numeroIntroducido = Integer.parseInt(s.nextLine());
      if (numeroIntroducido == numeroPensado) {
        System.out.println("Enhorabuena, lo has adivinado");
        oportunidades += 10;
      }
      if (numeroIntroducido > numeroPensado) {
        System.out.println("Te has pasado");
      } else if (numeroIntroducido < numeroPensado) {
        System.out.println("Te has quedado corto");
      }
      if (oportunidades == 5) {
        System.out.println("Te has quedado sin oportunidades");
        System.out.println("El número que había pensado era el " + numeroPensado);
      }
    }
  }
}
