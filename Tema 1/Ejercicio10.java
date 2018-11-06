public class Ejercicio10 {
 public static void main(String[] args) {
  String horoscopo = "";
   System.out.println("Conozca cuál es su horóscopo");
    System.out.print("Introduzca el mes en que nació (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca el día (1-31): ");
    int dia = Integer.parseInt(System.console().readLine());
    if (mes <= 0 || mes > 12) {
      System.out.println("ERROR: Introduzca un mes válido");
    } else if (dia > 31 || dia <= 0) {
      System.out.println("ERROR: Introduzca un día válido");
    } else {      
      switch(mes) {
        case 1:
          if (dia < 21) {
            horoscopo = "capricornio";
          } else {
            horoscopo = "acuario";
          } break;
        case 2:
          if (dia < 20) {
            horoscopo = "acuario";
          } else {
            horoscopo = "piscis";
          } break;
        case 3:
          if (dia < 21) {
            horoscopo = "piscis";
          } else {
            horoscopo = "aries";
          } break;
        case 4:
          if (dia < 21) {
            horoscopo = "aries";
          } else {
            horoscopo = "tauro";
          } break;
        case 5:
          if (dia < 20) {
            horoscopo = "tauro";
          } else {
            horoscopo = "géminis";
          } break;
        case 6:
          if (dia < 22) {
            horoscopo = "géminis";
          } else {
            horoscopo = "cáncer";
          } break;
        case 7:
          if (dia < 22) {
            horoscopo = "cáncer";
          } else {
            horoscopo = "Leo";
          } break;
        case 8:
          if (dia < 24) {
            horoscopo = "leo";
          } else {
            horoscopo = "virgo";
          } break;
        case 9:
          if (dia < 23) {
            horoscopo = "virgo";
          } else {
            horoscopo = "libra";
          } break;
        case 10:
          if (dia < 23) {
            horoscopo = "libra";
          } else {
            horoscopo = "escorpio";
          } break;
        case 11:
          if (dia < 23) {
            horoscopo = "escorpio";
          } else {
            horoscopo = "sagitario";
          } break;
        case 12:
          if (dia < 21) {
            horoscopo = "sagitario";
          } else {
            horoscopo = "capricornio";
          } break;
        default:
      }
    System.out.print("Su horóscopo es " + horoscopo);
    }
  }
}
