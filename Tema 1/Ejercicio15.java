public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Programa para realizar pirámides");
    System.out.print("Introduce el carácter con el que quiere que esté");
    System.out.print(" formada la pirámide: ");
    String k = System.console().readLine();
    System.out.println("Elige la opción deseada(a, b, c o d)");
    System.out.println("a) La pirámide apunta hacia arriba");
    System.out.println("b) La pirámide apunta hacia abajo");
    System.out.println("c) La pirámide apunta hacia la izquierda");
    System.out.println("d) La pirámide apunta hacia la derecha");
    String opcion = System.console().readLine();
    System.out.println("--------------------------------------");
    System.out.println(" ");
    if (opcion.equals ("a")) {
      System.out.println("   " + k);
      System.out.println("  " + k + " " + k);
      System.out.println(" " + k + " " + k + " " + k);
    } else if (opcion.equals ("b")) {
      System.out.println(" " + k + " " + k + " " + k);
      System.out.println("  " + k + " " + k);
      System.out.println("   " + k);
    } else if (opcion.equals ("c")) {
      System.out.println("     " + k);
      System.out.println("   " + k + " " + k);
      System.out.println(" " + k + " " + k + " " + k);
      System.out.println("   " + k + " " + k);
      System.out.println("     " + k);
    } else if (opcion.equals ("d")) {
      System.out.println(" " + k + "    ");
      System.out.println(" " + k + " " + k + "   ");
      System.out.println(" " + k + " " + k + " " + k);
      System.out.println(" " + k + " " + k + "   ");
      System.out.println(" " + k + "    ");
    } else {
      System.out.println("ERROR: Seleccione una opción válida");
    }
  }
}
