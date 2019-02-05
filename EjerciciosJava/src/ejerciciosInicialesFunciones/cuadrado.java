package ejerciciosInicialesFunciones;

public class cuadrado {

	public static void main(String[] args) {
		
		int n=0;
		
		System.out.println("Dame un número");
		n=Entrada.entero();
		/*//cuadrado lleno
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n;j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
*/
		/*//cuadrado vacio
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n;j++) {
				
				if(i==1 || i==n) {
					System.out.print("* ");
				}
				
				else if(j==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n;j++) {
				
				
				
				if(i==j) {
					System.out.print("* ");
				}
				else if(i+j==(n+1)){
					System.out.print("* ");
				}
				
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
