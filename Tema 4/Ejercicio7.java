public class Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("Calcular media de 3 notas");
    System.out.print("Por favor inserte la primera nota: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor inserte la segunda nota: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor inserte la tercera nota: ");
    Double c = Double.parseDouble(System.console().readLine());
    double x = (a + b + c) / 3;
    if (a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10) {
    System.out.println("ERROR: Las notas deben destar entre 0 y 10");
    } else {
      System.out.printf("La media de las tres notas es: %.2f", x);
    }
  }
}
