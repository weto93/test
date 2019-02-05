package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		
		System.out.println("Introduzca un número entero");
		numero1=Entrada.entero();
		
		System.out.println("Introduzca otro número entero");
		numero2=Entrada.entero();
		
		if (numero1>numero2) {
			
			System.out.println("El número: "+numero1+" es mayor que el número: "+numero2);
			
							}
		
		else {
			
			if(numero2>numero1) {
				System.out.println("El número: "+numero2+" es mayor que el número: "+numero1);
				}
			
			else {
				
				System.out.println("Ambos números son iguales");
			}
			
				}
	}
	
}
