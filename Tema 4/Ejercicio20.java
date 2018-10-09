public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Saber si su número es capicúa");
    System.out.print("Introduzca un número entero positivo (max. 5 cifras): ");
    int num = Integer.parseInt(System.console().readLine());
    if (num < 10) {
      System.out.println("Su número es capicúa");
    } else if (num < 100) {
      if ((num/10) == (num%10)) {
        System.out.println("Su número es capicúa");
      } else {
        System.out.println("Su número no es capicúa");
      }
    } else if (num < 1000) {
      if ((num/100) == (num%10)) {
        System.out.println("Su número es capicúa");
      } else {
        System.out.println("Su número no es capicúa");
      }
    } else if (num < 10000) {
      if ((num/1000) == (num%10) && ((num/100)%10) == ((num/10)%10)) {
        System.out.println("Su número es capicúa");
      } else {
        System.out.println("Su número no es capicúa");
      }
    } else if (num < 100000) {
      if ((num/10000) == (num%10) && ((num/1000)%10) == ((num/10)%10)) {
        System.out.println("Su número es capicúa");
      } else {
        System.out.println("Su número no es capicúa");
      }
    } else if ((num < 0 || num > 100000)) {
      System.out.println("Introduzca un número válido");
    }
  }
}
