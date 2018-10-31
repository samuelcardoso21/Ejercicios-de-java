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
    int numeroPalo = (int) ((Math.random() * 4) + 1);
    int numeroFigura = (int) ((Math.random() * 13) + 1);
    String nombrePalo = "";
    String nombreFigura = "";
    
    switch (numeroFigura) {
      case 1: 
        nombreFigura = "as";
        break;
      case 11:
        nombreFigura = "J";
        break;
      case 12:
        nombreFigura = "Q";
        break;
      case 13:
        nombreFigura = "K";
        break;
      default:
      nombreFigura = String.valueOf(numeroFigura);
      
    }
        
    
    switch (numeroPalo) {
      case 1:
        nombrePalo = "corazones";
        break;
      case 2:
        nombrePalo = "diamantes";
        break;
      case 3:
        nombrePalo = "picas";
        break;
      case 4:
        nombrePalo = "tréboles";
        break;
      default:
    }
    System.out.println("Su carta generada es: " + nombreFigura + " de " + nombrePalo);
  }
}