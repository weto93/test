package EjerciciosInicialesInstruccionesAlternativas;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int entero1=0;
		int entero2=0;
		int entero3=0;
		
		System.out.println("Introduce un n�mero entero");
		entero1=Entrada.entero();
		
		System.out.println("Introduce otro n�mero entero");
		entero2=Entrada.entero();
		
		System.out.println("Introduzca un �ltimo n�mero");
		entero3=Entrada.entero();
		
		if(entero1+entero2==entero3) {
			System.out.println("La suma de "+entero1+" m�s "+entero2+" coincide con "+entero3);
			
		}
		else {
				if(entero3+entero2==entero1) {
					System.out.println("La suma de "+entero3+" m�s "+entero2+" coincide con "+entero1);
				}
				else {
					if(entero3+entero1==entero2) {
						System.out.println("La suma de "+entero3+" m�s "+entero1+" coincide con "+entero2);
					}
					else {
							System.out.println("Ning�n resultado de la suma de dos valores coincide entre si");
						}
					}
				}
		}
	

}
