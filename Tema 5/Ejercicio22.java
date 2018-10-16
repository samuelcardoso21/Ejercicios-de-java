public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("Números primos entre 2 y 100: ");
    int primo = 1;
    for (int n = 2; n <= 100; n++) {
      primo = 1;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = 0;
        }
      }
      if (primo == 1) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}

