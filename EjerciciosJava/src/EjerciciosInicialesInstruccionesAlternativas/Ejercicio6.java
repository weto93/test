package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		int numero=0;
		
		
		System.out.println("Introduzca un n�mero entre el 0 y el 9999");
		numero=Entrada.entero();
		
		if(numero>=0 && numero<=9999) {
			
			if(numero>=1000) {
				
				System.out.println("El n�mero tiene 4 cifras");
				
			}
			else {
				
				if(numero>=100) {
					
					System.out.println("El numero tiene 3 cifras");
					
				}
				else {
					
					
					if(numero>=10) {
						
						System.out.println("El n�mero tiene 2 cifras");
						
					}
					else {
						System.out.println("El n�mero tiene 1 cifra");
					}
				}
			}
			
		}
		else {
			System.out.println("El n�mero no est� entre 0 y 9999");
			}
			
	}

}
