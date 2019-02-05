package ejemplosJAVABASICO;

public class EjercicioNumerosPrimos {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=2,num=0;
		
		System.out.println("Introduzca un número");
		num=Entrada.entero();
		
		while(i<=num/2 && num%i!=0)
			i++;
		
		if(i>num/2)
			System.out.println("El número "+num+" es primo");
		else
			System.out.println("El número "+num+" NO es primo");
	
	}

	
	public static boolean esPrimo(int num)
	{
		int i=2;
		while(i<=num/2 && num%i!=0)
			i++;
		
		if(i>num/2)
			return true;
		else
			return false;
	}
	
}
