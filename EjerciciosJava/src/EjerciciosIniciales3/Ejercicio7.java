package EjerciciosIniciales3;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int enteroP=0, acumulador=0;
		
		
		
		while(enteroP>=0) {
			System.out.println("Escribe un n�mero entero positivo");
			enteroP=Entrada.entero();
			
			if(enteroP>0) {
				acumulador=acumulador+enteroP;
				
			}
		}
System.out.println("La suma de los n�mero enteros es "+acumulador);
	}

}
