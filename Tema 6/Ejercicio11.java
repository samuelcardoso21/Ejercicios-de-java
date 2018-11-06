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
public class Ejercicio11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Notas de los alumnos por orden de lista:");
    String nombreNota = "";
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    for (int i = 1; i <= 20; i++) {
      int numeroNota = (int) (Math.random() * 11);
      if (numeroNota < 5) {
        nombreNota = "Suspenso";
        suspensos++;
      } else if (numeroNota == 5) {
        nombreNota = "Suficiente";
        suficientes++;
      } else if (numeroNota == 6) {
        nombreNota = "Bien";
        bienes++;
      } else if (numeroNota  <= 8 && numeroNota >= 7) {
        nombreNota = "Notable";
        notables++;
      } else if (numeroNota == 9 || numeroNota == 10) {
        nombreNota = "Sobresaliente";
        sobresalientes++;
      }
      System.out.println(i + ". " + nombreNota);
    }
    System.out.println("\nNúmero de suspensos: " + suspensos);
    System.out.println("Número de suficientes: " + suficientes);
    System.out.println("Número de bienes: " + bienes);
    System.out.println("Número de notables: " + notables);
    System.out.println("Número de sobresalientes: " + sobresalientes);
  }
  
}
