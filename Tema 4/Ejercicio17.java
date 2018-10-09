public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número, el programa le dará la ");
    System.out.print(" última cifra: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("La última cifra del número introducido es: ");
    System.out.println(num%10);
  }
}
