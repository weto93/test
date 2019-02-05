package EjerciciosIniciales2;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		
		System.out.println("Escribe un número entero:");
		num1=Entrada.entero();
		
		System.out.println("Escribe otro número:");
		num2=Entrada.entero();
		
		if(num1%num2==0)
		{
			System.out.println(num1+" es múltiplo de "+num2);
			
		}
		else {
			
			if(num2%num1==0) {
				System.out.println(num2+" es múltiplo de "+num1);
			}
			else {
				
				if(num1%num2!=0 && num2%num1!=0) {
					System.out.println(num1+" y "+num2+" NO son múltiplos uno del otro");
				}
			
				
			}
		}
		
		
		
	}
	

}
