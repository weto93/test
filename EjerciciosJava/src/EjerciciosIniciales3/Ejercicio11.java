package EjerciciosIniciales3;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int entero=1, tope=10, introd=0, acumula=0,acumulaN=0, media=0, cuentaN=0, cuenta0=0;
		
		for(entero=1; entero<=tope; entero++) {
			
			System.out.println("Introduce 10 números enteros:");
			introd=Entrada.entero();
			
			if(introd>0) {
				acumula=acumula+introd;
			}
			
			if(introd<0) {
				acumulaN=acumulaN+introd;
				cuentaN++;
				media=acumulaN/cuentaN;
			}
			
			if(introd==0) {
				cuenta0++;
			}
			
		}

		
		System.out.println("La suma de los números positivos es "+acumula);
		System.out.println("La media de los números negativos es "+media);
		System.out.println("El número de ceros que ha introducido el usuario es "+cuenta0);
	}

}
