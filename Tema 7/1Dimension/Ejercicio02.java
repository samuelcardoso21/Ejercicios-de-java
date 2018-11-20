/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07;

/**
 *
 * @author samuel
 */
public class Ejercicio02 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    
    for (int i = 0; i < 8; i++) {
    System.out.println(i + ": " + simbolo[i]);
  }
    
  }
  
}
