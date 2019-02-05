package vectores;

public class EjerciciosOrdenacionAlumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vectorDes = generaVectorAleatorio(50000, 1, 1000);
		int[]  vectorOrd;
		
		/*System.out.println("Vector desordenado...");
		muestraVector(vectorDes);
		vectorOrd=generaVectorOrdenadoInsercion(vectorDes);
		*/
		System.out.println("\n\nBúsqueda normal....");
		int i=0,numero=432;
		long start_time = System.currentTimeMillis();
		while(i<vectorDes.length && vectorDes[i]!=numero)
			i++;
		System.out.println("El número "+numero+" está en la posición "+i);
		long end_time = System.currentTimeMillis();
		
		long diferencia=end_time-start_time;
		System.out.println("\n\nTiempo: "+diferencia+" milisegundos");
		
		System.out.println("\n\nBúsqueda binaria....");
		start_time = System.currentTimeMillis();
		ordenacion.quicksort(vectorDes,0 ,vectorDes.length-1 );
		System.out.println("El dato "+numero+" está en la posición "+busquedaBin(vectorDes, numero));
		end_time = System.currentTimeMillis();
		
		diferencia=end_time-start_time;
		System.out.println("\n\nTiempo: "+diferencia+" milisegundos");
		/*
		System.out.println("Vector ordenado...");
		muestraVector(vectorOrd);*/
	}

	public static void muestraVector(int[] vector) {
		for (int i = 0; i < vector.length; i++)
			System.out.println("En la posición " + i + " está el valor " + vector[i]);
	}
	
	public static void muestraVectorParcial(int[] vector,int min, int max) {
	System.out.println("Mostrando vector desde posición "+min+" a posición "+max);
	for (int i = min; i <= max; i++)
		System.out.print(vector[i]+" ");
	System.out.println("\n\n");
}
	
	public static int[] generaVectorAleatorio(int tam, int min, int max) {

		int[] vector12 = new int[tam];

		for (int i = 0; i < vector12.length; i++) {
			int aleatorio = (int) (Math.random() * (max)) + min;
			vector12[i] = aleatorio;
		}
		return vector12;
	}

	// Ejercicio 2 Ismael
	public static int[] generaVectorOrdenadoInsercion(int vectorDesordenado[]) {
		int[] vectorOrdenado = new int[vectorDesordenado.length];
		int i, temp, j;
		vectorOrdenado[0] = vectorDesordenado[0];
		for (i = 1; i < vectorDesordenado.length; i++) {
			temp = vectorDesordenado[i];
			j = i - 1;
			while ((j >= 0) && (vectorOrdenado[j] > temp)) {
				vectorOrdenado[j + 1] = vectorOrdenado[j];
				j--;
			}
			vectorOrdenado[j + 1] = temp;
		}
		return vectorOrdenado;
	}

	//Ejercicio 2 profe
	static void ordenaVectorEnOtroVector(int[] arrD, int[] arrO)
	{
		
		for (int i=0; i<arrD.length; i++) //recorro el vector desordenado
		{
			int j=i-1, temp=arrD[i];
				while ((j >= 0) && (arrO[j] > temp)) {  //uso método de inserción
					arrO[j + 1] = arrO[j];
					j--;
				}
				arrO[j + 1] = temp;
		}
	}


	// Jose María Ejercicio 4

	public static void muestraDiezMayores(int[] vec) {
		int temp;
		for (int i = 1; i < vec.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vec[i] > vec[j]) {
					temp = vec[j];
					vec[j] = vec[i];
					vec[i] = temp;
				}
			}
		}
		for (int i = 0; i < Math.min(vec.length, 10); i++) {
			System.out.println(vec[i]);
		}
	}

	// Manuel ejercicio 6
	public static void mostrarOperadores() {

		int[] vector = generaVectorAleatorio(100, 80, 10);
		int mayorRepeticion = 0, numMasRepetido = 0, maximo, minimo, media, sumaVector = 0, valorMasRepetidoActual = 1;

		ordenacion.quicksort(vector,0 ,vector.length-1);
				
		muestraVector(vector);
		maximo = vector[vector.length - 1];
		minimo = vector[0];

		for (int k = 0; k < vector.length; k++) {
			sumaVector += vector[k];
		}
		media = sumaVector / vector.length;
		int k=1;
		while (k<vector.length) {			
			while(k<vector.length 
					&& vector[k - 1] == vector[k]) {
				valorMasRepetidoActual++;
				k++;
			}
			
			if (valorMasRepetidoActual > mayorRepeticion) {
				numMasRepetido = vector[k-1];
				mayorRepeticion = valorMasRepetidoActual;			
			}
			valorMasRepetidoActual=1;
			k++;

		}

		System.out.println("\nEl máximo es: " + maximo);
		System.out.println("\nEl mínimo es: " + minimo);
		System.out.println("\nLa media es: " + media);
		System.out.println("\nEl número más veces repetido es: " + numMasRepetido + " y aparece " + mayorRepeticion);
	}

	// Vero Ejercicio 7
	public static int busquedaBin(int[] vector, int dato) {

		int centro, inf = 0, sup = vector.length - 1;
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			muestraVectorParcial(vector, inf, sup);
			if (vector[centro] == dato)
				return centro;
			else if (dato < vector[centro])
				sup = centro - 1;
			else
				inf = centro + 1;
			System.out.println("\t·Max: " + sup + "\n\t·Centro: " + centro + "\n\t·Min: " + inf + "\n\t·Valor: "
					+ vector[centro] + "\n");
		}
		return -1;

	}

}


	
	

