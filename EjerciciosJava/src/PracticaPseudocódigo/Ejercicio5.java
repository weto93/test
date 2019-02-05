package PracticaPseudocódigo;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero=0, unidades=0, decenas=0;
		
		System.out.println("Escribe un número entre 1 y 99");
		numero=Entrada.entero();
		
		if(numero>1 && numero<=99) {
			
			unidades=numero%10;
			decenas=numero/10;
		}

	}

}
