package EjerciciosIniciales3;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int enteroP=0, acumulador=0, contador=0;
		double media=0;
		while(enteroP>=0) {
			System.out.println("Escribe un número entero positivo");
			enteroP=Entrada.entero();
			
			if(enteroP>0) {
				contador++;
				acumulador=acumulador+enteroP;
			}
			media=(double)acumulador/(double)contador;
		}
		System.out.println("La media de los número positivos introducidos es "+media);
	}

}
