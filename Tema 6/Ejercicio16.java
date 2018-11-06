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
public class Ejercicio16 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String nombreFigura = "";
    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;
    
    for (int i = 1; i <= 3; i++) {
      int numeroFigura = (int) (Math.random() * 5) + 1;
      switch (i) {
        case 1:
          figura1 = numeroFigura;
          break;
        case 2:
          figura2 = numeroFigura;
          break;
        case 3:
          figura3 = numeroFigura;
          break;
        default:
      }
      switch (numeroFigura) {
        case 1:
          nombreFigura = "corazón";
          break;
        case 2:
          nombreFigura = "diamante";
          break;
        case 3:
          nombreFigura = "herradura";
          break;
        case 4:
          nombreFigura = "limón";
          break;
        case 5:
          nombreFigura = "campana";
          break;
        default:
      }
      System.out.print(nombreFigura + " ");
    }
    if (figura1 == figura2 && figura1 == figura3) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas");
    } else if (figura1 == figura2 || figura1 == figura3 || figura2 == figura3) {
      System.out.println("\nBien, ha recuperado su moneda");
    } else {
      System.out.println("\nLo siento, ha perdido");
    }
    
    
  }
  
}
