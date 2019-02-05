package EjerciciosIniciales;

public class While {

	public static void main(String[] args) {
		
		/*int num=0;
		
		System.out.println("Escribe un putito número");
		num=Entrada.entero();
		
		for(int i=0; i<num; i++){
			
			System.out.println("*");
		}*/
		
		String cuadrante="";
		
		while(!cuadrante.equals("arriba izquierda") || !cuadrante.equals("arriba derecha") || !cuadrante.equals("abajo izquierda") || !cuadrante.equals("abajo derecha")) {
			System.out.println("Elige cuadrante a romper:");
			cuadrante=Entrada.cadena();
		}
		
	}
	
}
