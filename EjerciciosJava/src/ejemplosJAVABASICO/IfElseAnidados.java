package ejemplosJAVABASICO;

public class IfElseAnidados {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Introduce un n�mero entero");
		num=Entrada.entero();
		
		if (num>0){
			System.out.println("El n�mero es positivo");
		}
		else 
			if(num<0){
				System.out.println("El n�mero es negativo");
			}
			else {
				System.out.println("El n�mero es cero");
			
		}

		// ...O tambi�n...
		
		/* if (num>0){
			System.out.println("El n�mero es positivo");
		}
		else {
			if(num<0){
				System.out.println("El n�mero es negativo");
			}		
			else {
				System.out.println("El n�mero es cero");
			}
			
		}*/
		 
		
		

	}

}
