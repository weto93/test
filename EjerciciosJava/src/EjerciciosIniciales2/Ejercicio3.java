package EjerciciosIniciales2;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		
		System.out.println("Escribe un n�mero entero");
		num1=Entrada.entero();
		
		System.out.println("Ecribe otro n�mero entero");
		num2=Entrada.entero();
		
		if(num1%num2==0){
			System.out.println(num1+" es m�ltiplo de "+num2);
		}		
		else {
			System.out.println(num1+" no es m�ltiplo de "+num2);
		}
	}

}
