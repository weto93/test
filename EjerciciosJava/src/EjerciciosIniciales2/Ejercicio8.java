package EjerciciosIniciales2;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		double baseT,alturaT, areaT;
		
		System.out.println("Introduzca la base del tri�ngulo");
		baseT=Entrada.real();
		
		System.out.println("Introduzca la altura del triangulo");
		alturaT=Entrada.real();
		
		areaT=(baseT*alturaT)/2;
		
		System.out.println("El �rea del triangulo es: "+areaT);
		
		double radio, areaC;
		
		System.out.println("Introduzca el radio del circulo:");
		radio=Entrada.real();
		
		areaC=Math.PI*Math.pow(radio, 2);
		
		System.out.println("El �rea del circulo es: "+areaC);
		
		if(areaT>areaC) {
			System.out.println("El �rea del tri�ngulo es mayor al del c�rculo");
		}
		else {
			System.out.println("El �rea del circulo es mayor al del triangulo");
			
		}

	}

}
