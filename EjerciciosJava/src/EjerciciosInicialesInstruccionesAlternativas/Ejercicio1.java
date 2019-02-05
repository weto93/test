package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double num=0.0;
		
		System.out.println("Introduce un número");
		num=Entrada.real();
		
		if(num>0) {
			
			System.out.println("El número es positivo");
			
					}
		else{
			
			if(num==0) {
				
				System.out.println("El número es cero");
							
						}
			else {
				
				System.out.println("El número es negativo");
			}
		}
		
		
		
		
	}
	
	
}
