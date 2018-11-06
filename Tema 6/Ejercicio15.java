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
public class Ejercicio15 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String nombreNota = "";
    int numeroNota;
    int numeroNotas= 4 * (int)(Math.random() * 7 + 1);
    String primeraNota = "";
    
    for (int i = 0; i < (numeroNotas - 1); i++) {
      numeroNota = (int) (Math.random() * 7) + 1;
      
      if ((i % 4 == 0) && (i != 0)) {
        System.out.print("| ");
      }
      
      switch (numeroNota) {
        case 1:
          nombreNota = "do";
          break;
        case 2:
          nombreNota = "re";
          break;
        case 3:
          nombreNota = "mi";
          break;
        case 4:
          nombreNota = "fa";
          break;
        case 5:
          nombreNota = "sol";
          break;
        case 6:
          nombreNota = "la";
          break;
        case 7:
          nombreNota = "si";
          break;
        default:
      }
      if (i == 0) {
        primeraNota = nombreNota;
      }
      System.out.print(nombreNota + " ");
    }
    System.out.print(primeraNota + " ||");
  }
  
}
