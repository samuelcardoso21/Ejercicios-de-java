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
public class Coche extends Vehiculo {
  
  String marca;
  String modelo;
  String color;
  int anoFabricacion;
  
  void quemaRueda() {
    System.out.println("*Quemas rueda con el coche sin avanzar*");
    System.out.println("Fffffffffsssssshhhh");
  }

  public Coche(String marca, String modelo, String color, int anoFabricacion) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.anoFabricacion = anoFabricacion;
  }
  
}
