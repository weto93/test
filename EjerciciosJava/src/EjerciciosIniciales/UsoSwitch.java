package EjerciciosIniciales;

public class UsoSwitch {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Escribe el número secreto");
		num=Entrada.entero();
		
		switch(num) {
		
		case 1: System.out.println("Has introducido 1");
		break;
		
		case 2: System.out.println("Has introducido 2");
		break;
		
		case 3: System.out.println("Correcto, era el número secreto");
		break;
		
		default: 
			System.out.println("NO HAS OBTENIDO PREMIO");
		
		}
		
	}

}
