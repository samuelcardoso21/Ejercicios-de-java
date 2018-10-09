public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("¿Cuántos dígitos tiene mi número entero?");
    System.out.print("Introduzca su número entero (máx. 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    if (num < 10 && num > 0) {
      System.out.println("Su número tiene 1 dígito");
    } else if (num < 100 && num > 0) {
      System.out.println("Su número tiene 2 dígitos");
    } else if (num < 1000 && num > 0) {
      System.out.println("Su número tiene 3 dígitos");
    } else if (num < 10000 && num > 0) {
      System.out.println("Su número tiene 4 dígitos");
    } else if (num < 100000 && num > 0) {
      System.out.println("Su número tiene 5 dígitos");
    } else if (num > -10) {
      System.out.println("Su número tiene 1 dígito");
    } else if (num > -100) {
      System.out.println("Su número tiene 2 dígitos");
    } else if (num > -1000) {
      System.out.println("Su número tiene 3 dígitos");
    } else if (num > -10000) {
      System.out.println("Su número tiene 4 dígitos");
    } else if (num > -100000) {
      System.out.println("Su número tiene 5 dígitos");
    } else {
      System.out.println("Introduzca un número válido de hasta 5 cifras");
    }
  }
}
