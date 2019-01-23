/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceptos.Ejercicio05;

/**
 *
 * @author samuel
 */
public class Caballo {
  
  String raza;
  String color;
  int edad;
  
  void anda() {
    System.out.println("*El caballo comienza a andar lentamente*");
  }
  
  void trota() {
    System.out.println("*El caballo comienza a trotar*");
  }
  
  void galopa() {
    System.out.println("*El caballo comienza a galopar*");
  }
  
  void para() {
    System.out.println("*El caballo se detiene por completo*");
  }
  
  void come(String comida) {
    if (comida.equals("Pienso")) {
      System.out.println("*El caballo come pienso*");
    } else {
      System.out.println("*El caballo rechaza la comida*");
    }
  }
  
  void relincha() {
    System.out.println("Hiiiiiiiiii");
  }
  
}
