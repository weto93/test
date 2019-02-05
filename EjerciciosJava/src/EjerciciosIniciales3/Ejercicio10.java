package EjerciciosIniciales3;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int entero=0, acumulador=0, contador=0;
		System.out.println("Introduce un número entero");
		entero=Entrada.entero();
		while(entero>0 || entero<0) {
			if(entero%2==0) {
				System.out.println("El número introducido es PAR");
			}
			else {
				System.out.println("El número introducido es IMPAR");
			}
			System.out.println("Introduce un número entero");
			entero=Entrada.entero();
		}

	}

}
