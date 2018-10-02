/** 
 * Pedir dos números y multiplicarlos
 **/
public class Ejercicio1 {
	public static void main(String [] args) {
		String linea;
		System.out.println("Inserte un número: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt(linea);
		System.out.println("Inserte otro número: ");
		linea = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt(linea);
		int resultado;
		resultado = primerNumero * segundoNumero;
		System.out.println("Primer número = " + primerNumero);
		System.out.println("Segundo número = " + segundoNumero);
		System.out.println("Resultado = " + resultado);
	}
}
