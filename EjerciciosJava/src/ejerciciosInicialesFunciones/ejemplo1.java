package ejerciciosInicialesFunciones;

public class ejemplo1 {

	public static void main(String[] args) {
		
		int devuelve;
		
		
		devuelve=pideNumero();
		moduloEjecutandose(devuelve);
		

	}

	public static int pideNumero()
	{
		int num=0;
		System.out.println("Introduce un n�mero: ");
		num=Entrada.entero();
		
		return num;
	}
	 public static void moduloEjecutandose(int devuelve){
		 int i=0;
		 while (i<devuelve) {
			 System.out.println("M�dulo ejecutandose");
			 i++;
		 }
		 
	 }
	
}
