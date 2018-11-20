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
public class Ejercicio15 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] gente = new int[10];
    int i;
    
    for (i = 0; i < 10; i++) {
      gente[i] = (int) (Math.random() * 4) + 1;
    }
    
    
    
    int n;
    do{
      for (i = 0; i < 62; i++) {
      System.out.print("-");
      }
      System.out.println("-");
      System.out.print("| Mesa nº   ");
      for (i = 0; i < 10; i++) {
        System.out.printf("|%3d ", i+1);
      }
      System.out.println("|");
      for (i = 0; i < 62; i++) {
        System.out.print("-");
      }
      System.out.println("-");
      System.out.print("| Ocupación ");
      for (i = 0; i < 10; i++) {
        System.out.printf("|%3d ", gente[i]);
      }
      System.out.println("|");
      for (i = 0; i < 62; i++) {
        System.out.print("-");
      }
      System.out.println("-");
      System.out.print("¿Cuántos "
                + "son? (Introduzca -1 para salir del programa): ");
        n = Integer.parseInt(s.nextLine());
        for(i = 0; i < 10; i++){
          if(gente[i] + n <= 4 && n >= 0){
            if (gente[i] == 0) {
            gente[i] += n;
            System.out.println("Por favor, siéntense en la mesa número "
                    + (i+1));
            break;
            } else {
              gente[i] += n;
              System.out.println("Tendrán que compartir mesa. Por favor, "
                      + "siéntense en la mesa número " + (i+1));
              break;
            }
          } else if(n == -1) {
            System.out.println("Adiós.");
            break;
          }else if ((gente[i] == gente[9]) && (gente[i] + n > 4)) {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
            break;
          } 
        }
        
    }while(n != -1);
   
  }
}
