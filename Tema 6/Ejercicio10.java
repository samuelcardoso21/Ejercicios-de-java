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
public class Ejercicio10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String caracter = "";
    
    for (int filas = 1; filas <= 10; filas++) {
      int numeroCaracter = (int) (Math.random() * 6) + 1;
      
      int columnas = (int) (Math.random() * 40) + 1;
      for (int i = 1; i <= columnas; i++) {
        switch(numeroCaracter) {
          case 1:
            caracter = "*";
            numeroCaracter = (int) (Math.random() * 6) + 1;
            break;
          case 2:
            caracter = "-";
            numeroCaracter = (int) (Math.random() * 6) + 1;
            break;
          case 3:
            caracter = "=";
            numeroCaracter = (int) (Math.random() * 6) + 1;
            break;
          case 4:
            caracter = ".";
            numeroCaracter = (int) (Math.random() * 6) + 1;
            break;
          case 5:
            caracter = "|";
            numeroCaracter = (int) (Math.random() * 6) + 1;
            break;
          case 6:
            caracter = "@";
            numeroCaracter = (int) (Math.random() * 6) + 1;
            break;
          default:
        }
        System.out.print(caracter);
      }
      System.out.println("");
    }
        
        
  }
  
}
