public class Ejercicio08 {
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
      System.out.println("ERROR: Las notas deben de estar entre 0 y 10");
    } else {
      System.out.printf("La media de las tres notas es: %.2f \n", x);
    } if (x < 5) {
      System.out.println("Has suspendido, que pena");
    } else if (x >= 5 && x < 6) {
      System.out.println("Has sacado un suficiente");
    } else if (x >=6 && x < 7) {
      System.out.println("Has sacado un bien");
    } else if (x >=7 && x < 9) {
      System.out.println("Has sacado un notable");
    } else {
      System.out.println("Enhorabuena, has sacado un sobresaliente");
    }      
  }
}
