package PracticaPseudocódigo;



public class Ejercicio1 {

	public static void main(String[] args) {

		char carac;
		
		System.out.println("Introduce un carácter:");
		carac=Entrada.caracter();
		
		if(carac=='a' || carac=='e' || carac=='i' || carac=='o' || carac=='u') {
			
				System.out.println("El caracter introducido es minúscula y vocal");
				
		}
		
		else {
			
			if(carac=='A' || carac=='E' || carac=='I' || carac=='O' || carac=='U') {
				
				System.out.println("El caracter introducido es mayúscula y vocal");
				
			}
			
			else {
				
				System.out.println("El caracter introducido es consonante");
				
			}
			
		}
	}

}
