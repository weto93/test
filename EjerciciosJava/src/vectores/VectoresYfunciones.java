package vectores;

public class VectoresYfunciones {

	public static void main(String[] args) {


	
		
	int [] vec={3,6,7,9,2};
		
		
		System.out.println("Mostrando valores iniciales de vec....\n");
		muestraValoresVector(vec);  

	}
	
	public static void muestraValoresVector(int [] vector)
	{
		for(int i=0;i<vector.length; i++)
			System.out.println("La posición "+i+" contiene el valor "+vector[i]);
	}

	
	public static void devuelvePosicion(int [] posicion) {
		
	}
	
	
}


