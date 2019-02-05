package PracticaPseudocódigo;

public class Ejercicio4 {

	public static void main(String[] args) {
	
		int segundos=0, minutos=0, horas=0;
		
		System.out.println("Escribe un número de segundos:");
		segundos=Entrada.entero();
		
		minutos=segundos/60;
		
		horas=minutos/60;
		
		System.out.println("La cantidad introducida equivale a "+horas+" horas "+minutos+" minutos "+segundos+" segundos ");

	}

}
