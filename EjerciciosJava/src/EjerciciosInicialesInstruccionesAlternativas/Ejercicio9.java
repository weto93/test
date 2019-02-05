package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int entero1=0;
		int entero2=0;
		int entero3=0;
		
		System.out.println("Introduce un número entero");
		entero1=Entrada.entero();
		
		System.out.println("Introduce otro número entero");
		entero2=Entrada.entero();
		
		System.out.println("Introduzca un último número");
		entero3=Entrada.entero();
		
		if(entero1+entero2==entero3) {
			System.out.println("La suma de "+entero1+" más "+entero2+" coincide con "+entero3);
			
		}
		else {
				if(entero3+entero2==entero1) {
					System.out.println("La suma de "+entero3+" más "+entero2+" coincide con "+entero1);
				}
				else {
					if(entero3+entero1==entero2) {
						System.out.println("La suma de "+entero3+" más "+entero1+" coincide con "+entero2);
					}
					else {
							System.out.println("Ningún resultado de la suma de dos valores coincide entre si");
						}
					}
				}
		}
	

}
