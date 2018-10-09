public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Introduzca un número entero con un máximo de 5 cifras");
    int num = Integer.parseInt(System.console().readLine());
    if (num < 10) {
      System.out.println("Su número solo tiene una cifra: " + num);
    } else if (num < 100) {
      System.out.println("La primera cifra de su número es: " + num/10);
    } else if (num < 1000) {
      System.out.println("La primera cifra de su número es: " + num/100);
    } else if (num < 10000) {
      System.out.println("La primera cifra de su número es: " + num/1000);
    } else if (num < 100000) {
      System.out.println("La primera cifra de su número es: " + num/10000);
    } else {
      System.out.println("Introduzca un número entero de hasta 5 cifras");
    }
  }
}
    
