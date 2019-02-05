package vectores;

public class EjercicioVectores1 {

	public static void main(String[] args) {
		
		int [] vectorAleatorio=new int[10];

		int pares=0, impares=0;
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			
			vectorAleatorio[i]=(int)(Math.random()*20)+1;
			System.out.println("Posición "+i+" para "+vectorAleatorio[i]);
		}
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			if(vectorAleatorio[i]%2==0) {
				pares++;
			}
			else {
				impares++;
			}
			
		}
		
		System.out.println("Hay "+pares+" números pares y "+impares+" números impares");
		
	}

}
