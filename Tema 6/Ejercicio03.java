package tema06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samuel
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    int numeroCarta = (int) (Math.random() * 10) + 1;
    int numeroPalo = (int) (Math.random() * 4) + 1;
    String nombreCarta = "";
    String nombrePalo = "";
   
    switch (numeroCarta) {
      case 1:
        nombreCarta = "el as";
        break;
      case 8:
        nombreCarta = "la sota";
        break;
      case 9:
        nombreCarta = "el caballo";
        break;
      case 10:
        nombreCarta = "el rey";
        break;
      default:
        nombreCarta = "el " + String.valueOf(numeroCarta);
    }
    
    switch (numeroPalo) {
      case 1:
        nombrePalo = "espadas";
        break;
      case 2:
        nombrePalo = "bastos";
        break;
      case 3:
        nombrePalo = "oros";
        break;
      case 4:
        nombrePalo = "copas";
        break;
      default:
    }
    System.out.println("Su carta es " + nombreCarta + " de " + nombrePalo + ".");
  }
}
