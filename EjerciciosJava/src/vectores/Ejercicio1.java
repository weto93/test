package vectores;

public class Ejercicio1 {

	static final int NUM=15;
	
	public static void main(String[] args) {
	
		char [] vocales={'a','e','i','o','u'};
		float [] vectorF1=new float[10];
		
		for(int i=0;i<10;i++) {
		System.out.println("Dame un valor para la posición "+i);
		vectorF1[i]=(float)Entrada.real();
		}
		
		float [] vectorF2=new float[10];
		vectorF2=vectorF1.clone();
		
		
		
		int [] vectorI=new int[NUM];
		
		for(int i=0;i<NUM;i++) {
			System.out.println("El valor de vectorI en la posición "+i+" es "+vectorI[i]);
		}
		
		for(int i=0;i<NUM;i++) {
			vectorI[i]=5*(i+1);
			System.out.println("El valor de vectorI en la posición "+i+" es "+vectorI[i]);
		}
		
		if(vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
		for(int i=0;i<10;i++) {
		System.out.println("Dame un valor para la posición "+i+" del vectorF2");
		vectorF2[i]=(float)Entrada.real();
		}
		
		if(vectorF1.equals(vectorF2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
		float [] vectorFsuma=new float [10];
		
		for(int i=0;i<vectorFsuma.length;i++) {
		vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		}
		
		for(int i=0;i<vectorFsuma.length;i++) {
			System.out.println("El contenido el vectorFsuma para la posición "+i+" es "+vectorFsuma[i]);
			}
		
		for(int i=0;i<vocales.length;i++) {
			vocales[i]=Character.toUpperCase(vocales[i]);
		}
		
		for(int i=0;i<vocales.length;i++) {
			System.out.println("El contenido del vector vocales en la posición "+i+" es "+vocales[i]);
		}
		
	}

}
