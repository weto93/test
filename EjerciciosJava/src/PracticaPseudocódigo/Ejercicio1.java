package PracticaPseudoc�digo;



public class Ejercicio1 {

	public static void main(String[] args) {

		char carac;
		
		System.out.println("Introduce un car�cter:");
		carac=Entrada.caracter();
		
		if(carac=='a' || carac=='e' || carac=='i' || carac=='o' || carac=='u') {
			
				System.out.println("El caracter introducido es min�scula y vocal");
				
		}
		
		else {
			
			if(carac=='A' || carac=='E' || carac=='I' || carac=='O' || carac=='U') {
				
				System.out.println("El caracter introducido es may�scula y vocal");
				
			}
			
			else {
				
				System.out.println("El caracter introducido es consonante");
				
			}
			
		}
	}

}
