package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio2v2 {

	
	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		
		System.out.println("Introduzca un número entero");
		numero1=Entrada.entero();
		
		System.out.println("Introduzca otro número entero");
		numero2=Entrada.entero();
		
		
		if(numero1>numero2) {
			
			System.out.println("El número: "+numero1+" es mayor que "+numero2);
			
		}
		
		if(numero1<numero2) {
			
			System.out.println("El número: "+numero1+" es menor que "+numero2);
					}
		
		if(numero1==numero2) {
			
			System.out.println("Ambos números son iguales");
			
		}
		
	}
	
}
