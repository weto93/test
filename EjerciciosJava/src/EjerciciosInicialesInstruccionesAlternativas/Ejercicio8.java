package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio8 {

	static final double PI=3.14159;
	
	public static void main(String[] args) {
		
		double base=0, altura=0, radio=0, areaT=0, areaC=0;
		
		System.out.println("Introduzca la base y la altura del tri�ngulo");
		base=Entrada.real();
		altura=Entrada.real();
			
		System.out.println("Introduzca radio del c�rculo");
		radio=Entrada.real();
		
		areaT=(base*altura);
		areaC=PI*(Math.pow(radio, 2));
		
		if(areaT>areaC) {
			System.out.println("El �rea del c�rculo es mayor que el �rea del tri�ngulo");	
		}
		if(areaT<areaC) {
			System.out.println("El �rea del tri�ngulo es mayor que la del c�rculo");
		}
		if(areaT==areaC) {
			System.out.println("El �rea de ambos es igual");
		}
		

	}

}
