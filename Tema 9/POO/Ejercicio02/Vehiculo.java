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
public class Vehiculo {
  
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  
  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
  
}
