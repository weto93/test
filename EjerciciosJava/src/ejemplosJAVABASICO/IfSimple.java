package ejemplosJAVABASICO;

public class IfSimple {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un n�mero entero");
		num=Entrada.entero();
		
				
		if (num>=0) {
			System.out.println("El n�mero es positivo");
			System.out.println("Quillo, que el n�mero no es positivo te he dicho");
		}
		
		System.out.println("ADIOS");
			
	/* Cuando las estructuras if o bucles contienen una sola l�nea, no se necesitan las llaves {}
		a�n as�, las pondremos para el ejemplo */
		

	}

}
