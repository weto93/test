package EjerciciosIniciales2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		System.out.println("Introduzca un número entero:");
		num1=Entrada.entero();
		
		System.out.println("Introduzca otro número entero:");
		num2=Entrada.entero();
		
		
		if (num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		}
		else {
			System.out.println(num2+" es mayor que "+num1);
			
		}
		if(num1==num2) {
			
			System.out.println(num1+" y "+num2+" son iguales");
		}
	}

}
