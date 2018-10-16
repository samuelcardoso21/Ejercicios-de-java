public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    while (altura < alturaIntroducida) {
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      if (altura>1) {
        System.out.print(relleno);
      }
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    }
    for (i = 1; i < altura*2; i++) {
      System.out.print(relleno);
    }
  }
}

