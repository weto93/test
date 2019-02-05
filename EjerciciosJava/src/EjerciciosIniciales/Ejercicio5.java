package EjerciciosIniciales;

public class Ejercicio5 {

	
	
	public static void main(String[] args) {
		
		int dividendo;
		int divisor;
		int cociente;
		int resto;
		
		
		System.out.println("INTRODUZCA EL DIVIDENDO");
		dividendo=Entrada.entero();
		
		System.out.println("INTRODUZCA EL DIVISOR");
		divisor=Entrada.entero();
		
		cociente=dividendo/divisor;
		System.out.println("EL COCIENTE DE LA DIVISÓN ES: "+cociente);
		
		resto=dividendo%divisor;
		System.out.println("EL RESTO DE LA DIVISIÓN ES: "+resto);
		
	}
	
}
