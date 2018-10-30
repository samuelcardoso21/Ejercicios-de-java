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
public class Ejercicio01 {
  public static void main(String[] args) {
    int dado1 = (int) ((Math.random() * 6) + 1);
    int dado2 = (int) ((Math.random() * 6) + 1);
    int dado3 = (int) ((Math.random() * 6) + 1);
    int suma = dado1 + dado2 + dado3;
    
    System.out.println("El primer dado muestra el número: " + dado1);
    System.out.println("El segundo dado muestra el número: " + dado2);
    System.out.println("El tercer dado muestra el número: " + dado3);
    System.out.println("Los 3 dados suman: " + suma);
  }
}
