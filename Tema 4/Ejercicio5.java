public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("Resolver ax + b = 0");
    System.out.print("Por favor introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
    if (a==0) {
    System.out.println("ERROR: Esta ecuación no tiene una solución real");
    } else {
      Double x = (-b/a);
      System.out.println("x = -b/a = " + x);
    }
  }
}
