package masEjerciciosFunciones;

public class Ejercicio1 {

	
	
	
	public static void main(String[] args) {
		String forma, cuadrado, rectangulo, triangulo, circulo;
		int area;
		double areaDouble;
		
		
		System.out.println("¿Qué desea hacer?\n a)Cuadrado\n b)Rectangulo\n c)Triángulo\n d)Círculo");
		forma=Entrada.cadena();
		
		if (forma.equals("a")) {
			
			area=areaCuadrado();
			System.out.println("El área del cuadrado es "+area);
		}
		
		if (forma.equals("b")) {
			
			area=areaRectangulo();
			System.out.println("El área del rectángulo es: "+area);
		}
		
		if(forma.equals("c")) {
			areaDouble=areaTriangulo();
			System.out.println("El área de un triángulo es: "+areaDouble);
		}
		
		if(forma.equals("d")) {
			areaDouble=areaCirculo();
		}
	}

	
public static int areaCuadrado() {
	int lado=0, areaC=0;
	System.out.println("Introduce el lado del cuadrado");
	lado=Entrada.entero();
	
	areaC=(int)Math.pow(lado, 2);
	
	return areaC;
}
	
public static int areaRectangulo() {
		int  base, altura, areaR;
		System.out.println("Introduce la base del rectángulo:");
		base=Entrada.entero();
		
		System.out.println("Introduce la altura:");
		altura=Entrada.entero();
		
		return areaR=base*altura;
		
		
	}
	
public static double areaTriangulo() {
	double base, altura, areaT;
	System.out.println("Introduce la base del triángulo:");
	base=Entrada.real();
	
	System.out.println("Introduce la altura del triángulo:");
	altura=Entrada.real();
	
	return areaT=(base*altura)/2;
}


public static double areaCirculo() {
	double radio, areaC;
	System.out.println("Introduce el radio del círculo:");
	radio=Entrada.real();
	
	return areaC=Math.pow(radio, 2)*Math.PI;
	
}

}
