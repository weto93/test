package EjerciciosIniciales2;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Introduce un número entero entre 0 y 9999");
		numero=Entrada.entero();
		
		if(numero>=1000 && numero<=9999) {
			
			System.out.println(numero+" tiene cuatro cifras");
			
		}
		
		else {
			
			if(numero>=10 && numero<=99){
				System.out.println(numero+" tiene dos cifras");
			}
			else {	
				if(numero>=100 && numero<=999) {
					System.out.println(numero+" tiene tres cifras");
				}
				
			}
			
			if(numero>9999 || numero<0){
				System.out.println("El número introducido está fuera de rango");
			}
			
		}
			

	}

}
