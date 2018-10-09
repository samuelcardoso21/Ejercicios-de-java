public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Cálculo de la media de la asignatura de programación");
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    double media = ((nota1 + nota2) / 2);
    if (media >= 5) {
      System.out.println("Su media es: " + media);
    } else {
      System.out.println("Su media es: " + media);
      System.out.print("Introduzca el resultado de la recuperación ");
      System.out.print("(apto/no apto): ");
      String recuperacion = System.console().readLine().toUpperCase();
      if (recuperacion.equals ("APTO")) {
        System.out.println("Enhorabuena, su media es 5, está aprobado");
      } else if (recuperacion.equals ("NO APTO")) {
        System.out.println("Ha suspendido, su media continúa siendo " + media);
      } else {
        System.out.println("Introduzca una respuesta válida");
      }
    }
  }
}
