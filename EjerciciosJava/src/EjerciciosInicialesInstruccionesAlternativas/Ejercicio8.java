package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio8 {

	static final double PI=3.14159;
	
	public static void main(String[] args) {
		
		double base=0, altura=0, radio=0, areaT=0, areaC=0;
		
		System.out.println("Introduzca la base y la altura del triángulo");
		base=Entrada.real();
		altura=Entrada.real();
			
		System.out.println("Introduzca radio del círculo");
		radio=Entrada.real();
		
		areaT=(base*altura);
		areaC=PI*(Math.pow(radio, 2));
		
		if(areaT>areaC) {
			System.out.println("El área del círculo es mayor que el área del triángulo");	
		}
		if(areaT<areaC) {
			System.out.println("El área del triángulo es mayor que la del círculo");
		}
		if(areaT==areaC) {
			System.out.println("El área de ambos es igual");
		}
		

	}

}
