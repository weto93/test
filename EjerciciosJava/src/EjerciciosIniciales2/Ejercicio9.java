package EjerciciosIniciales2;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int num1=0, num2=0, num3=0;
		
		
		System.out.println("Introduce un n�mero entero:");
		num1=Entrada.entero();
		
		System.out.println("Introduce otro n�mero entero:");
		num2=Entrada.entero();
		
		System.out.println("Introduce un �ltimo n�mero entero:");
		num3=Entrada.entero();
		
		if(num1+num2==num3) {
			System.out.println("La suma de "+num1+" y "+num2+" es igual a "+num3);
		}
		if(num1+num3==num2) {
			System.out.println("La suma de "+num1+" y "+num3+" es igual a "+num2);
		}
		if(num3+num2==num1) {
			System.out.println("La suma de "+num3+" y "+num2+" es igual a "+num1);
		}
	}

}
