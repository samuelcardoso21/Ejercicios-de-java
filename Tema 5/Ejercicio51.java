public class Ejercicio51 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    int volteado = 0;
    int n = numero;
    int anadidos = 0;
    
    while (n > 0) {
      volteado = (volteado * 10) + (n % 10);
      n /= 10;
    }
    while (volteado > 0) {
      n = volteado % 10;
      if (n == 8 || n == 0) {
      } else {
        anadidos *= 10;
        anadidos += n;
      }
      volteado /= 10;
    } if (numero != anadidos) {
    System.out.print("El gusano númerico ha dejado los números: ");
    System.out.println(anadidos);
    } else {
      System.out.println("El gusano no se ha comido ningun número");
    }
  }
}
