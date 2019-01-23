/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicio01;

/**
 *
 * @author samuel
 */
public class Ejercicio01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Caballo jupiter = new Caballo("PuraSangre", "Negro", 5);
    
    jupiter.anda();
    jupiter.para();
    
    System.out.println("|Dar de comer|");
    jupiter.come("carne");
    jupiter.come("pienso");
    
    jupiter.relincha();
    
  }
  
}
