package EjerciciosIniciales3;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int enteroP=0, acumulador=0;
		
		while(enteroP>=0) {
			System.out.println("Escribe un número entero positivo");
			enteroP=Entrada.entero();
			
			if(enteroP>0) {
				acumulador++;
			}
		}
		System.out.println("Has introducido "+acumulador+" números positivos");
	}

}
