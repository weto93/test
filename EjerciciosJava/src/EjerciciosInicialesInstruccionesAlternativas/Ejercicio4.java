package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero1=0;
		int numero2=0;
		int resto=0;
		
		
		System.out.println("Introduzca un n�mero entero");
		numero1=Entrada.entero();
		
		System.out.println("Introduzca otro n�mero entero");
		numero2=Entrada.entero();
		
		if(numero1==numero2) {
			
			System.out.println("Ambos n�meros son iguales, por lo que son m�ltiplos mutuos");
						
		}
		
		else {
			
			
			resto=numero1%numero2;
			
			if (resto==0) {
				
				System.out.println("El n�mero "+numero1+" es m��tiplo del n�mero "+numero2);
							}
			else {
				
				System.out.println("El n�mero "+numero1+" no es m�ltiplo del n�mero "+numero2);
					}
			
		}
		
		resto=numero2%numero1;
		
		if(resto==0) {
			System.out.println("El n�mero "+numero2+" es m�ltiplo del n�mero "+numero1);
		}
		else {
			System.out.println("El n�mero "+numero2+" no es m�ltiplo del n�mero "+numero1);
			
		}
	}
	
}
