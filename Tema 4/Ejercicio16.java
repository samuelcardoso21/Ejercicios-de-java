public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Test de infidelidad");
    System.out.print("Conteste las preguntas con V (Verdadero)");
    System.out.println(" o F (Falso)");
    int puntos = 0;
    System.out.println("Pregunta 1");
    System.out.print("Tu pareja parece estar más inquieta de lo normal");
    System.out.println(" sin ningún motivo aparente.");
    System.out.print("Respuesta: ");
    String respuesta1 = System.console().readLine().toUpperCase();
    if (respuesta1.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 2");
    System.out.println("Ha aumentado sus gastos de vestuario");
    System.out.print("Respuesta: ");
    String respuesta2 = System.console().readLine().toUpperCase();
    if (respuesta2.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 3");
    System.out.print("Ha perdido el interés que mostraba anteriormente ");
    System.out.println("por ti");
    System.out.print("Respuesta: ");
    String respuesta3 = System.console().readLine().toUpperCase();
    if (respuesta3.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 4");
    System.out.print("Ahora se afeita y se asea con más frecuencia ");
    System.out.print("(si es hombre) o ahora se arregla el pelo y se asea con");
    System.out.println(" más frecuencia (si es mujer) ");
    System.out.print("Respuesta: ");
    String respuesta4 = System.console().readLine().toUpperCase();
    if (respuesta4.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 5");
    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    System.out.print("Respuesta: ");
    String respuesta5 = System.console().readLine().toUpperCase();
    if (respuesta5.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 6");
    System.out.print("A veces tiene llamadas que dice no querer contestar");
    System.out.println(" delante");
    System.out.print("Respuesta: ");
    String respuesta6 = System.console().readLine().toUpperCase();
    if (respuesta6.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 7");
    System.out.print("Últimamente se preocupa más en cuidar la línea y/o");
    System.out.println(" estar bronceado/a");
    System.out.print("Respuesta: ");
    String respuesta7 = System.console().readLine().toUpperCase();
    if (respuesta7.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 8");
    System.out.print("Muchos días viene tarde después de trabajar porque dice");
    System.out.println(" tener mucho más trabajo");
    System.out.print("Respuesta: ");
    String respuesta8 = System.console().readLine().toUpperCase();
    if (respuesta8.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 9");
    System.out.println("Has notado que últimamente se perfuma más");
    System.out.print("Respuesta: ");
    String respuesta9 = System.console().readLine().toUpperCase();
    if (respuesta9.equals ("V")) {
      puntos+=3;
    }
    System.out.println("Pregunta 10");
    System.out.print("Se confunde y te dice que ha estado en sitios donde");
    System.out.println(" no ha ido contigo");
    System.out.print("Respuesta: ");
    String respuesta10 = System.console().readLine().toUpperCase();
    if (respuesta10.equals ("V")) {
      puntos+=3;
    }
    System.out.println("-----------------------------------------------------");
    System.out.println("Resultado del test de fidelidad:");
    if (puntos <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if ((puntos > 10) && (puntos <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su");
      System.out.print(" vida o en su mente, aunque seguramente será algo");
      System.out.println(" sin importancia. No bajes la guardia.");
    } else {
      System.out.print("Tu pareja tiene todos los ingredientes para estar ");
      System.out.print("viviendo un romance con otra persona. Te aconsejamos ");
      System.out.print("que indagues un poco más y averigües que es lo que ");
      System.out.println("está pasando por su cabeza");
    }
  }
}
