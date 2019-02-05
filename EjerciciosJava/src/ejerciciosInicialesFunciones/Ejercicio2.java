package ejerciciosInicialesFunciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
		int numA=4, numB=7, max, devuelveMax;
		
		max=numMax(numA,numB);
		devuelveMax=max;
		System.out.println("Imprime máximo "+max);
	}

	public static int numMax(int a,int b) {
		
		int max=0;
		
		max=(int)Math.max(a, b);
		
		return max;
		
	}
	
	
	
}
