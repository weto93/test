package EjerciciosIniciales;

public class Ejercicio4 {

	
	static final double PI=3.1415;
	
	public static void main(String[] args) {
		
		float radio;
		float area;
		float perimetro;
		
		System.out.println("Introduzca radio");
		radio=(float)Entrada.real();
		
		area=(float)PI*(float)Math.pow(radio,2);
		
		System.out.println("El resultado del �rea de un c�rculo de radio "+radio+" es: "+area);
		
		perimetro=(float)(2*PI)*radio;
		
		System.out.println("El resultado del per�metro de un c�rculo de radio "+radio+" es "+perimetro);
		
	}
	
}
