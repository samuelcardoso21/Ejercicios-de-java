/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicio01;

import Conceptos.Ejercicio05.*;

/**
 *
 * @author samuel
 */
public class Caballo {
  
  // Atributos
  String raza;
  String color;
  int edad;

  public Caballo(String raza, String color, int edad) {
    this.raza = raza;
    this.color = color;
    this.edad = edad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  
  
  // Métodos
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
    if (comida.equals("pienso")) {
      System.out.println("*El caballo come pienso*");
    } else {
      System.out.println("*El caballo rechaza la comida*");
    }
  }
  
  void relincha() {
    System.out.println("Hiiiiiiiiii");
  }
  
}
