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
public class Ejercicio14 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String pista = "";
    int numero;
    int maximo = 100;
    int minimo = 0;
    
    System.out.println("Piensa un número del 1 al 100 e intentaré adivinarlo");
    System.out.print("Pulsa intro para continuar");
    Scanner s = new Scanner(System.in);
    String nada = s.nextLine();
    for (int intentos = 1; intentos <= 5; intentos++) {
      System.out.println("Intento " + intentos + "/5");
      numero = (int) (Math.random() * (maximo - minimo)) + minimo;
      System.out.println("¿Has pensado en el " + numero + "? (s/n)");
      String acierto = s.nextLine();
      if (acierto.equals("s")) {
        System.out.println("He ganado");
        intentos += 10;
      } else if (intentos != 5) {
        System.out.println("¿Es mayor o menor?");
        pista = s.nextLine();
        if (pista.equals("mayor")) {
          minimo = numero;
        } else if (pista.equals("menor")) {
          maximo = numero;
        }
      } else {
        System.out.println("Has ganado");
      }
    }
    
  }
  
}
