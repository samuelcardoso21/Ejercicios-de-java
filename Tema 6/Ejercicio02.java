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
public class Ejercicio02 {
  public static void main(String[] args) {
    int palo = (int) ((Math.random() * 4) + 1);
    int numero = (int) ((Math.random() * 12) + 1);
    String corazones = "corazones";
    String diamantes = "diamantes";
    String picas = "picas";
    String treboles = "treboles";
    switch (palo) {
      case 1:
        String.valueOf(corazones);
        break;
      case 2:
       String.valueOf(diamantes);
        break;
      case 3:
        String.valueOf(picas);
        break;
      case 4:
        String.valueOf(treboles);
        break;
      default:
    }
    System.out.println("Su carta generada es el " + numero + " de " + palo);
  }
}
