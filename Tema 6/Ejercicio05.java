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
public class Ejercicio05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int suma = 0;
    int minimo = 199;
    int maximo = 100;
    for (int contador = 0; contador < 50; contador++) {
      int numero = (int) (Math.random() * 51) * 2;
      suma += numero;
      System.out.print(numero + " ");
      if (numero < minimo) {
        minimo = numero;
      } else if (numero > maximo) {
        maximo = numero;
      }
    }
    int media = suma / 50;
    System.out.println("\nEl número máximo es " + maximo);
    System.out.println("El número mínimo es " + minimo);
    System.out.println("La media de todos los números es " + media);
  }
}
