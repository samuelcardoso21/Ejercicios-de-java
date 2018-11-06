public class Ejercicio04 {
  public static void main(String[] args) {
    int sueldoSemanal;
    System.out.print("Introduzca el número de horas trabajadas en la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    if (horas < 40) {
      sueldoSemanal = 12 * horas;
    } else {
      sueldoSemanal = (40 * 12) + ((horas - 40) * 16);
    }
    System.out.println("Su sueldo semanal es de " + sueldoSemanal + " euros");
  }
}
