package EjerciciosIniciales2;

public class Ejercicio1 {

	public static void main(String[] args) {
	
	double numreal;
	
	System.out.println("Escribe un número:");
	numreal=Entrada.real();
	
	if(numreal>0) {
		System.out.println("El número "+numreal+" es positivo");
		
	}
	else {
		System.out.println("El número "+numreal+" es negativo");
	}
	
	}

}
