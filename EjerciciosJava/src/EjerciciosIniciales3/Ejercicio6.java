package EjerciciosIniciales3;

public class Ejercicio6 {

	public static void main(String[] args) {
		final int NUM_TOPE=20;
		
		int sumarPares=1, i=1,multiplicaImpares=1, total=0, totalM=1;
		
		while(sumarPares<=NUM_TOPE) {
			sumarPares=sumarPares+1;
			
					if(sumarPares%2==0) {
						total=total+sumarPares;
					};
		}

		System.out.println("La suma de los números PARES desde el 1 hasta el "+NUM_TOPE+" es: "+total);
		
		
		
		while(multiplicaImpares<=NUM_TOPE) {
			multiplicaImpares=multiplicaImpares+1;
			
			if(multiplicaImpares%2!=0) {
				totalM=totalM*multiplicaImpares;
			}
		}
		
		System.out.println("Las multiplicaciones de los impares desde el 1 al "+NUM_TOPE+" es "+totalM);
		
	}

}
