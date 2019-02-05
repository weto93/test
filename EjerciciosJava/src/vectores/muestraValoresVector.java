package vectores;

public class muestraValoresVector {

	public static void main(String[] args) {
		
		int [] vec={1,2,3,4,5};
		
		
		System.out.println("Mostrando valores iniciales de vec....\n");
		muestraVector(vec);

		

	}
	
	public static void muestraVector(int [] vector)
	{
		for(int i=0;i<vector.length; i++)
			System.out.println("En la posición "+i+" está el valor "+vector[i]);
	}
	
	
}
