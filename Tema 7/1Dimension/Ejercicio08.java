/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Ejercicio08 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] temperatura = new int[12];
    String[] mes = new String[12];
    mes[0] = "Enero";
    mes[1] = "Febrero";
    mes[2] ="Marzo";
    mes[3] = "Abril";
    mes[4] = "Mayo";
    mes[5] = "Junio";
    mes[6] = "Julio";
    mes[7] = "Agosto";
    mes[8] = "Septiembre";
    mes[9] = "Octubre";
    mes[10] = "Noviembre";
    mes[11] = "Diciembre";
    
    for (int i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media del mes de " + mes[i]);
      System.out.print(": ");
      temperatura[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.print("Digrama de barras sobre la temperatura media de cada");
    System.out.println(" mes:");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%10s |", mes[i]);
      for (int n = 0; n < temperatura[i]; n++) {
        System.out.print(" =");
      }
      System.out.println("");
    }
    
  }
  
}
