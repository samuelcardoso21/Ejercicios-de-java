public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Introduce un número");
    int numInt = Integer.parseInt(System.console().readLine());
    for (int i = numInt; i < numInt + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
