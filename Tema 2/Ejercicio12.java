public class Ejercicio12 {
  public static void main(String[] args) {
    int puntos = 0;
    System.out.println("Test - 1º DAM");
    System.out.print("Contesta a las siguientes preguntas respondiendo");
    System.out.println(" a, b o c");
    System.out.println("¿Cuál de las siguientes afirmaciones es incorrecta?");
    System.out.print("a. El tamaño y formato del registro lógico los define ");
    System.out.println("el programador");
    System.out.print("b. El tamaño del registro físico los define ");
    System.out.println("el programador");
    System.out.print("c. El área primaria contendrá los registros de datos, ");
    System.out.println("clasificados en orden ascendentes por su clave");
    System.out.print("Respuesta: ");
    String respuesta = System.console().readLine();
    if (respuesta.equals ("b")) {
      puntos++;
    }
    System.out.println("");
    System.out.println("Siguiente pregunta:");
    System.out.print("¿Cuál de los siguientes tipos de datos de Java ");
    System.out.println("tiene más precisión?");
    System.out.println("a. float");
    System.out.println("b. double");
    System.out.println("c. int");
    System.out.print("Respuesta: ");
    String respuesta2 = System.console().readLine();
    if (respuesta2.equals ("b")) {
      puntos++;
    }
    System.out.println("Fin del test, has conseguido " + puntos + " puntos");
  }
}
    
    
