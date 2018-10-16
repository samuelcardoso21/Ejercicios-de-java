public class S05Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = Integer.parseInt(System.console().readLine());
    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int a = 0;
        int b = 1;
        int aux;
        while(n > 2) {
            aux = a;
            a = b;
            b = aux + b;
            System.out.print(" " + b);
            n--;
        }
    }
    System.out.println();
  }
}
