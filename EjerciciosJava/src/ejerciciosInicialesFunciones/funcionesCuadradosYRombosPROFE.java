package ejerciciosInicialesFunciones;

public class funcionesCuadradosYRombosPROFE{
	
	public static void main(String[] args) {
		romboHueco(5);
	}

	public static void cuadrado(int tam) {
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void cuadradoHueco(int tam) {
		for(int i=0;i<tam;i++) {
			for(int j=0;j<tam;j++) {
				if(i==0 || j==0 || j==tam-1 || i==tam-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public static void rombo(int num)
	{		
		for (int i = 1; i <= num; i++) {

				for (int j = 0; j <(num - i) / 2; j++) 
					System.out.print("  ");				

				for (int k = 0; k < i; k++) {
					if(i%2==0)
						System.out.print(" *");
					else
						System.out.print("* ");
					}				
		    System.out.println();
		 }
		
		for (int i = num-1; i >0; i--) {

			for (int j = 0; j <(num - i) / 2; j++) 
				System.out.print("  ");				

			for (int k = 0; k < i; k++) {
				if(i%2==0)
					System.out.print(" *");
				else
					System.out.print("* ");
				}				
	    System.out.println();
	 }
	}
	
	public static void romboHueco(int num)
	{		
		for (int i = 1; i <= num; i++) {

				for (int j = 0; j <(num - i) / 2; j++) 
					System.out.print("  ");				

				for (int k = 0; k < i; k++) {
					if(i%2==0)
						if(k==0 || k==i-1)
							System.out.print(" *");
						else
							System.out.print("  ");
					else
						if(k==0 || k==i-1)
							System.out.print("* ");
						else
							System.out.print("  ");
					}				
		    System.out.println();
		 }
		
		for (int i = num-1; i >0; i--) {

			for (int j = 0; j <(num - i) / 2; j++) 
				System.out.print("  ");				

			for (int k = 0; k < i; k++) {
				if(i%2==0)
					if(k==0 || k==i-1)
						System.out.print(" *");
					else
						System.out.print("  ");
				else
					if(k==0 || k==i-1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}				
	    System.out.println();
	 }
	}
	
}
