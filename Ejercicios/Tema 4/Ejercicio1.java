public class Ejercicio1 {
	public static void main(String [] args) {
		System.out.print("Escriba un día entre el Lunes y el Viernes: ");
		String respuesta = System.console().readLine();
		String rojo = "\033[31m";
		if (respuesta.equals("Lunes")) {
			System.out.println("La primera clase es entornos de desarrollo");
		} else if (respuesta.equals("Martes")) {
			System.out.print("La primera clase del Martes es");
			System.out.println("sistemas informáticos");
		} else if (respuesta.equals("Miércoles")) {
			System.out.print("La primera clase del Miércoles es");
			System.out.println("programación");
		} else if (respuesta.equals("Miercoles")) {
			System.out.print("La primera clase del Miercoles es");
			System.out.println("programación");
		} else if (respuesta.equals("Jueves")) {
			System.out.print("La primera clase del Jueves es");
			System.out.println("programación");
		} else if (respuesta.equals("Viernes")) {
			System.out.print("La primera clase del Viernes es");
			System.out.println("sistemas informáticos");
		} else {
			System.out.print(rojo + "ERROR: Introduce un día válido situado ");
			System.out.print(rojo + "entre Lunes y Viernes empezando por ");
			System.out.print(rojo + "mayúscula");
		}
	}
}		
