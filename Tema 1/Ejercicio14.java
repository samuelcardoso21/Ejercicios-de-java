public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Averigua si su número es par y/o divisible entre 5");
    System.out.print("Introduzca un número: ");
    int n = Integer.parseInt(System.console().readLine());
    if (n%2 == 0) {
      System.out.print("Su número es par");
      if (n%5 == 0) {
        System.out.println(" y además es divisible entre 5");
      } else {
        System.out.println(" y no es divisible entre 5");
      }
    } else if (n%2 != 0) {
      System.out.print("Su número es impar");
      if (n%5 == 0) {
        System.out.println(" y es divisible entre 5");
      } else {
        System.out.println(" y no es divisible entre 5");
      }
    }
  }
}
