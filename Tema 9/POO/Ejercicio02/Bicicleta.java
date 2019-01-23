/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicio02;

/**
 *
 * @author samuel
 */
public class Bicicleta extends Vehiculo {
  
  String color;
  int anoFabricacion;
  
  void caballito() {
    System.out.println("*Haces el caballito con la bicicleta sin avanzar*");
  }

  public Bicicleta(String color, int anoFabricacion) {
    this.color = color;
    this.anoFabricacion = anoFabricacion;
  }
  
  
  
}
