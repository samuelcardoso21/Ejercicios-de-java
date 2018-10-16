import java.util.Scanner;
public class Ejercicio09 {
  public static void main(String[] args) {
    int numInt;
    int numDig = 1;
    int n = 10;
    System.out.println("¿Cuántos dígitos tiene mi número entero?");
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca su número entero: ");
    numInt = Integer.parseInt(s.nextLine());
    while (numInt > n) {
        n *= 10;
        numDig++;
      }
    System.out.println("Su número tiene " + numDig + " digitos");
    }
  }
