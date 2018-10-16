public class Ejercicio13 {
  public static void main(String[] args) {
    int numsPedidos = 0;
    int numsNeg = 0;
    int numsPos = 0;
    int ceros = 0;
    while (numsPedidos < 10) {
      System.out.print("Introduzca un número: ");
      int numInt = Integer.parseInt(System.console().readLine());
      if (numInt < 0) {
        numsNeg++;
      } else if (numInt > 0) {
        numsPos++;
      } else {
        ceros++;
      }
      numsPedidos++;
    } if (ceros==0) {
      System.out.print("Ha introducido " + numsPos + " números positivo/s");
      System.out.println(" y " + numsNeg + " números negativo/s");
      } else {
      System.out.print("Ha introducido " + numsPos + " números positivo/s");
      System.out.println(", " + numsNeg + " números negativo/s y ");
      System.out.println(ceros + " cero/s");
    }
  }
}
