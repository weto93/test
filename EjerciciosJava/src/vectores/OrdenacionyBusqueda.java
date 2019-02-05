package vectores;

public class OrdenacionyBusqueda {

	public static void main(String[] args) {
		
		int [] vectorOrdenado=new int [100];
		int [] vectorDesordenado;
		
		int i,j=0,temp;

	}

	
	static void burbujaOptimizada(int vector[])
	{
		int temp;
		int i, j;
		for (i = 1; i < vector.length; i++) {
			for (j = 0; j < i; j++) {
				if (vector[i] < vector[j]) {
					temp = vector[j];
					vector[j] = vector[i];
					vector[i] = temp;
				}
			}
		}
	}
	
}
