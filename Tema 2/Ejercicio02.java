public class Ejercicio02 {
	public static void main(String [] args) {
		System.out.println("¿Qué hora es?");
    System.out.print("Por favor introduzca solo un número del 1 al 24: ");
		String linea = System.console().readLine();
    int hora = Integer.parseInt(linea);
    if (hora >= 6 && hora <=12) {
      System.out.println("Buenos días");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes");
    } else if (hora >= 21 && hora <= 5) {
      System.out.println("Buenas noches");
    } else {
      System.out.print("Hora no válida, atienda a las escificaciones del");
      System.out.println(" programa");
    }
  }
}
