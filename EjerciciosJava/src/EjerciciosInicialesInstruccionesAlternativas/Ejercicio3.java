package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		
		System.out.println("Escribe un número");
		numero1=Entrada.entero();
		
		System.out.println("Escribe otro número");
		numero2=Entrada.entero();
		
		if (numero1%numero2==0) {
			System.out.println("El número "+numero1+" es múltiplo de "+numero2);
			
		}
			
			else {
				
				System.out.println("El número "+numero1+" NO es múltiplo de "+numero2);
				
			}
			
			
		
		
		
	}
	
}
