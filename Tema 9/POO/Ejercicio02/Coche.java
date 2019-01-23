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
  
  void anda(int metros) {
    System.out.println("Andas con el coche " + metros + " metros");
  }
  void quemaRueda() {
    System.out.println("Quemas rueda con el coche sin avanzar");
  }

  public Coche(String marca, String modelo, String color, int anoFabricacion) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.anoFabricacion = anoFabricacion;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnoFabricacion() {
    return anoFabricacion;
  }

  public void setAnoFabricacion(int anoFabricacion) {
    this.anoFabricacion = anoFabricacion;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  
  
}
