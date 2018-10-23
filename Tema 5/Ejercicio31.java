public class Ejercicio31 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de L que dibujará el programa: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.println("");
    int base = ((altura/2) + 1);
    int h = 1;
    int b = 0;
    while (altura > h) {
      System.out.println("*");
      h++;
    }
    while (base > b) {
    System.out.print("* ");
    b++;
    }
  }
}
