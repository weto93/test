package EjerciciosIniciales;


public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		double numR;
		float cuadrado;
		
		System.out.println("Introduzca un n�mero REAL");
		numR=Entrada.real();
		
		cuadrado = (float)Math.pow(numR,2);
		
		System.out.println("El n�mero multiplicado por s� mismo es: "+cuadrado);
		
		
	}
	

}
