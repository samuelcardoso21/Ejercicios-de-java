public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Media de varios números");
    System.out.println("Inserte un número negativo cuando desee finalizar");
    double nums = 0;
    double suma = 0;
    double numInt = 0;
    while (numInt >= 0) {
      System.out.print("Introducir número: ");
      numInt = Double.parseDouble(System.console().readLine());
      nums++;
      suma += numInt;
    }
    System.out.print("La media de los números introducidos es ");
    System.out.println((suma - numInt) / (nums - 1));
  }
}
      
