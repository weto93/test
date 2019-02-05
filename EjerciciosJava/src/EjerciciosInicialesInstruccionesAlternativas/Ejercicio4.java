package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		int resto=0;
		
		
		System.out.println("Introduzca un número entero");
		numero1=Entrada.entero();
		
		System.out.println("Introduzca otro número entero");
		numero2=Entrada.entero();
		
		if(numero1==numero2) {
			
			System.out.println("Ambos números son iguales, por lo que son múltiplos mutuos");
						
		}
		
		else {
			
			
			resto=numero1%numero2;
			
			if (resto==0) {
				
				System.out.println("El número "+numero1+" es múñtiplo del número "+numero2);
							}
			else {
				
				System.out.println("El número "+numero1+" no es múltiplo del número "+numero2);
					}
			
		}
		
		resto=numero2%numero1;
		
		if(resto==0) {
			System.out.println("El número "+numero2+" es múltiplo del número "+numero1);
		}
		else {
			System.out.println("El número "+numero2+" no es múltiplo del número "+numero1);
			
		}
	}
	
}
