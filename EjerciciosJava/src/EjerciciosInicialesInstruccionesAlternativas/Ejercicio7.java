package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio7 {

	public static void main(String[] args) {
	
		/*Escribe un algoritmo que pida al usuario un número real y 
		 * muestre por pantalla la nota del alumno, teniendo en cuenta: 
		0-5 es INSUFICIENTE (0 inclusive)
		5-6 es SUFICIENTE (5 inclusive)
		6-7 es BIEN (6 inclusive)
		7-9 es NOTABLE (7 inclusive)
		9-10 es SOBRESALIENTE (9 y 10 inclusives)*/

		
		double nota=00;
		
		System.out.println("Escribe tu nota");
		nota=Entrada.real();
		
		if(nota<5 && nota>=0) {
			
			System.out.println("Su nota es INSUFICIENTE");
		}
		if(nota>=5 && nota<6) {
			
			System.out.println("Su nota es SUFICIENTE");
		}
		if(nota>=6 && nota<7) {
			
			System.out.println("Su nota es BIEN");
		}
		if(nota>=7 && nota<9) {
		
			System.out.println("Su nota es NOTABLE");
		}
		if(nota>=9 && nota<=10) {
			
			System.out.println("Su nota es SOBRESALIENTE");
		}
		if(nota<0 || nota>10) {
			
			System.out.println("Nota no válida");
		}
	}

}
