public class Ejercicio32 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca un número entero positivo");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long volteado = 0;
    int suma = 0;
    while (numeroIntroducido > 0) {
      volteado = (volteado * 10) + (numeroIntroducido % 10);
      numeroIntroducido /= 10;
    }
    System.out.print("Dígitos pares: ");
    while (volteado > 0) {
      long digito = volteado % 10;
      if (digito % 2 == 0) {
      System.out.print(digito + " ");
      suma += digito;
      }
      volteado /= 10;
    }
    System.out.println("\nSuma de los dígitos pares = " + suma);
  }
}
