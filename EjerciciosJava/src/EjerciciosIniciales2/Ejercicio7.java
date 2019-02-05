package EjerciciosIniciales2;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		double numero;
		
		System.out.println("Escribe tu NOTA:");
		numero=Entrada.real();
		
		if(numero>=0 && numero<5) {
			System.out.println("La nota es INSUFICIENTE");
		}
		else {
			
			if(numero>=5 && numero<6) {
				System.out.println("La nota es SUFICIENTE");
			}
			else {
				
				if(numero>=6 && numero<7) {
					System.out.println("La nota es BIEN");
				}
				else {
					
					if(numero>=7 && numero<9) {
						System.out.println("La nota es NOTABLE");
					}
					else {
						
						if(numero>=9 && numero<=10) {
							System.out.println("La nota es SOBRESALIENTE");
						}
						
					}
				}
				
			}
			
			if(numero>10) {
				System.out.println("LA NASA TE BUSCA");
			}
		}

	}

}
