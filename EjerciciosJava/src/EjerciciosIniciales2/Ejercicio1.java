package EjerciciosIniciales2;

public class Ejercicio1 {

	public static void main(String[] args) {
	
	double numreal;
	
	System.out.println("Escribe un n�mero:");
	numreal=Entrada.real();
	
	if(numreal>0) {
		System.out.println("El n�mero "+numreal+" es positivo");
		
	}
	else {
		System.out.println("El n�mero "+numreal+" es negativo");
	}
	
	}

}
