package vectores;

public class ordenaVector {

	public static void main(String[] args) {
		int [] vector= {5,1,7,3,9,-2,56};
		
		ordenaVector(vector);
	
	}

	
	public static void ordenaVector(int [] vector){
		
		int acumula=0;
		
		for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector.length;j++) {
			if(vector[i]<vector[j]) {
				acumula=vector[j];
				vector[j]=vector[i];
				vector[i]=acumula;
			}
			
			}
		}
		
		for(int k=0;k<vector.length;k++) {
			System.out.print(vector[k]);
		}
	
	}
	
}
