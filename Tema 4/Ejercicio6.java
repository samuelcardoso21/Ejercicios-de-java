public class Ejercicio6 {
  final static double g = 9.81;
  public static void main(String[] args) {
    System.out.println("Calcular el tiempo que tarda en caer un objeto");
    System.out.print("Inserte la altura en metros desde ");
    System.out.print("la que cae el objeto: ");
     Double h = Double.parseDouble(System.console().readLine());
     double t = Math.sqrt(2*h/g);
     System.out.printf("El objeto tarda %.2f segundos en caer", t);
   }
 }
     
