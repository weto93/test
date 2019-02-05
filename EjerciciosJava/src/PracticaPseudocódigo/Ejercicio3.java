package PracticaPseudocódigo;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		int entero1=0, entero2=0, potencia=0;
		
		System.out.println("Escribe un número entero positivo");
		entero1=Entrada.entero();
		
		System.out.println("Escribe otro número entero positivo");
		entero2=Entrada.entero();
		
		if(entero1>entero2) {
			
			System.out.println(+entero1+"^"+entero2+" es igual a "+Math.pow(entero1, entero2) );
		}
		
		else {
			System.out.println(+entero2+"^"+entero1+" es igual a "+Math.pow(entero2, entero1) );
		}
	}

}
