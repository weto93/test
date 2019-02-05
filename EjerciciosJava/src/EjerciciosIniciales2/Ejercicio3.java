package EjerciciosIniciales2;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		
		System.out.println("Escribe un número entero");
		num1=Entrada.entero();
		
		System.out.println("Ecribe otro número entero");
		num2=Entrada.entero();
		
		if(num1%num2==0){
			System.out.println(num1+" es múltiplo de "+num2);
		}		
		else {
			System.out.println(num1+" no es múltiplo de "+num2);
		}
	}

}
