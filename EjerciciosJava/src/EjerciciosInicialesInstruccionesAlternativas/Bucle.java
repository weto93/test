package EjerciciosInicialesInstruccionesAlternativas;

public class Bucle {

	public static void main(String[] args) {
		
		int num=0;
		
		System.out.println("Introduce un n�mero:");
		num=Entrada.entero();
				
		for (int i=0; i<num; i++)
		{
			System.out.println("*");
		}

	}

}
