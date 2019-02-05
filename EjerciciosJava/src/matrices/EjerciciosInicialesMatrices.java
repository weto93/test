package matrices;

public class EjerciciosInicialesMatrices {

	public static void main(String[] args) {
		
		int num=0;
		int [][] matriz= new int [4][4];
		
		sumaMatriz(matriz);
		
		System.out.println("\n\nRellenando matriz...\n\n");
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
			{
				System.out.println("Introduzca un valor para fila "+i+" columna "+j);
				matriz[i][j]=Entrada.entero();
			}
		
		System.out.println("La suma de todos los valores de la matriz es igual  a "+sumaMatriz(matriz));
		
		System.out.println("Escribe el número a buscar:");
		num=Entrada.entero();
		
		buscaElemento(matriz,num);
				
		if(esMatrizCuadrada(matriz)) {
			System.out.println("Es cuadrado");
		}
		else {
			System.out.println("No es cuadrado");
		}
	}

	
	public static int sumaMatriz(int [][] matriz) {
		
		int devuelve=0;
		
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
			{
				devuelve+=matriz[i][j];			}
		
		return devuelve;
	}
	
	public static void buscaElemento(int [][] matriz,int num) {
		
		int numero=num, elemento=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
			{
				if(matriz[i][j]==numero){
					System.out.println("En la fila "+i+" y columna"+j+" se encuentra el "+numero);
				}
			}
		
		
	}
	
	public static boolean esMatrizCuadrada(int [][] matriz) {
		
		boolean boleano=true;
		int i=0, j=0;
		
		while(i<matriz.length) {
			j=0;
			while(j<matriz[i].length) {
				j++;
			}
			
			i++;
		}
		
		if(i==j) {
			boleano=true;
		}
		else {
			boleano=false;
		}
		return boleano;
	}
	
	
	
}
