public class Ejercicio36 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(System.console().readLine());
    long auxiliar = numero;
    long numeroVolteado = 0;
    int digito = 0;
    while (auxiliar > 0) {
      digito = (int)(auxiliar % 10);
      auxiliar = auxiliar / 10;
      numeroVolteado = numeroVolteado * 10 + digito;
    }
    if (numeroVolteado == numero) {
      System.out.println("El número " + numero + " es capicúa");
    } else {
      System.out.println("El número " + numero + " no es capicúa");
    }
  }
}
