public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Cálculo de segundos restantes para la media noche");
    System.out.print("Introduce la hora (0-23): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos(0-59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    int segundos = (hora * 3600) + (minutos * 60);
    int segsRests = 86400 - segundos;
    if ((segundos > 86400) || hora < 0 || minutos < 0 || (segsRests < 0)) {
      System.out.println("ERROR: Introduzca datos válidos");
    } else if (hora == 0 && minutos == 0) {
      System.out.println("Ya es media noche");
    } else {
      System.out.print("Faltan " + segsRests + " para la media noche");
    }
  }
}
    
