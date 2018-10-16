public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int primo = 1;
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        primo = 0;
      }
    }
    if (primo == 1) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }
  }
}

