package PracticaPseudocódigo;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		char carac='d';
		
		while(carac!='o' && carac!='a' && carac!='e' && carac!='i' && carac!='u') {
			
			System.out.println("Escribe un caracter");
			carac=Entrada.caracter();
			
			System.out.println("El caracter introducido es: "+carac);
		}

	}

}
