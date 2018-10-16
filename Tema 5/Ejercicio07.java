public class Ejercicio07 {
  public static void main(String[] args) {
    int combinacion = 6218;
    int intentos = 1;
    System.out.println("Introduzca la combinación de la caja fuerte");
    while (intentos <=4) {
      int num = Integer.parseInt(System.console().readLine());
      if (num == 6218) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      } else {
        if (intentos >= 4) {
          System.out.println("Lo siento, esa no es la combinación");
          System.out.println("La caja fuerte ha sido bloqueada");
        } else {
          System.out.println("Lo siento, esa no es la combinación");
          System.out.println("Introduzca la combinación de la caja fuerte");
          System.out.println("Intento nº " + intentos +"/4");
          intentos++;
        }
      }
    }
  }
}

