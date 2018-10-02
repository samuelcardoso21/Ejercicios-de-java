public class Ejercicio9 {
  public static void main(String[] args) {
    double x1, x2;
    System.out.println("Resolver ax² + bx + c = 0");
    System.out.print("Inserte el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Inserte el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.print("Inserte el valor de c: ");
    Double c = Double.parseDouble(System.console().readLine());
    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    } if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    } if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    } if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    } if ((a != 0) && (b != 0) && (c != 0)) {
      double discriminante = b*b - (4 * a * c);
      if (discriminante < 0) {
          System.out.println("La ecuación no tiene soluciones reales");
      }  else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    }
  }
}
