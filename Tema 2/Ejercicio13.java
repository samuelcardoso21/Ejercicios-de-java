public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Programa para ordenar números de menor a mayor");
    System.out.print("Introduzca un número: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el último número: ");
    int c = Integer.parseInt(System.console().readLine());
    int aux;
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    System.out.print("El orden de los números introducidos es: ");
    System.out.println(a + ", " + b + ", " + c);
  }
}
