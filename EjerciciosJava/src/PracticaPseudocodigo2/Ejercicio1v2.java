package PracticaPseudocodigo2;

public class Ejercicio1v2 {

	public static void main(String[] args) {
	
		int entero=0, acumulaDos=0, contadorPrimo=2, restoNum=0, cuentaNum=0;
		
		System.out.println("Escribe un número entero");
		entero=Entrada.entero();
		
		while(entero>=10) {
			
			acumulaDos=entero%100;
			restoNum=entero/100;
			
			while(acumulaDos%contadorPrimo!=0 && contadorPrimo<acumulaDos) {
				contadorPrimo++;			
			}
			
			if(contadorPrimo==acumulaDos) {
				cuentaNum++;
				System.out.println("El número "+acumulaDos+" es primo");			
			}
			
			
			
			entero=restoNum;
			contadorPrimo=2;
		}

		System.out.println("El número introducido contiene "+cuentaNum+" números primos");
		
	}

}
