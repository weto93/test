package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		
		System.out.println("Escribe un n�mero");
		numero1=Entrada.entero();
		
		System.out.println("Escribe otro n�mero");
		numero2=Entrada.entero();
		
		if (numero1%numero2==0) {
			System.out.println("El n�mero "+numero1+" es m�ltiplo de "+numero2);
			
		}
			
			else {
				
				System.out.println("El n�mero "+numero1+" NO es m�ltiplo de "+numero2);
				
			}
			
			
		
		
		
	}
	
}
