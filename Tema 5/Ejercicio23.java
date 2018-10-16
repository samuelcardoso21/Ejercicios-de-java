public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.print("El programa terminará cuando la suma de los números sea");
    System.out.println(" mayor que 10000.");
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    System.out.print("Ha introducido un total de " + numeroDeElementos);
    System.out.println(" números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  }
}

