public class Ejercicio27 {
  public static void main(String[] args) {
    System.out.print("Este programa muestra, cuenta y suma los múltiplos de 3");
    System.out.println(" que hay entre 1 y el número introducido");
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int n = 1;
    int suma = 0;
    while (numeroIntroducido > n) {
      System.out.println("3*" + n + " = " + 3*n);
      n++;
      suma += 3*n;
    }
    System.out.println("\nSe muestran en pantalla " + n + " multiplos de 3");
    System.out.println("La suma de estos hace un total de: " + suma);
  }
}
