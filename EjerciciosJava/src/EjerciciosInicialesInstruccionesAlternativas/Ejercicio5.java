package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		char letra1=' ';
		char letra2=' ';
		char letra3=' ';
		
		
		letra1=Entrada.caracter();
		letra2=Entrada.caracter();
		letra3=Entrada.caracter();
		
		
		if(letra1>letra2 && letra1>letra3) {
			
		
			if(letra2>letra3) {
				
				System.out.println(letra1+" "+letra2+" "+letra3);
								}
			else {
				
				System.out.println(letra1+" "+letra3+" "+letra2);
				}
			
											}
		
		if(letra3>letra1 && letra3>letra2) {
				
			if(letra2>letra1) {
				
				System.out.println(letra3+" "+letra2+" "+letra1);
			}
			else {
				
				System.out.println(letra3+" "+letra1+" "+letra2);
			}
											}

		if(letra1==letra2 && letra2==letra3) {
			
			System.out.println(letra3+" "+letra2+" "+letra1);
		}
		
	}

}
