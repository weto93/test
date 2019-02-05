package ejerciciosInicialesFunciones;

public class EjemploFunciones {
	
	static int numGlobal=1;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA, numB,suma=0;
		
		/*
		System.out.println("Introduce un n�mero: ");
		numA=Entrada.entero();
		
		System.out.println("Introduce un n�mero: ");
		numB=Entrada.entero();
		
		suma=numA+numB;
		
		System.out.println("\n\nLa suma de los n�meros es "+suma+"\n\n");
		*/
		
		numA=pideNumero(); //5
		
		numB=pideNumero(); //6		
		
		suma=sumaNumeros(numA,numB);
		
		
		imprimeResultadoSuma(suma); 
		
		pideNumerosSumalosEImprimelos();
		
	/*
		System.out.println("Estamos a punto de entrar en la funci�n modificaDentroPeroFueraSigueIgual y numA vale "+numA+"\n\n");
		
		modificaDentroPeroFueraSigueIgual(numA);
		
		System.out.println("Hemos salido de la funci�n modificaDentroPeroFueraSigueIgual y numA vale "+numA+"\n\n");
		
		System.out.println("Estamos a punto de entrar en la funci�n modificaDentroYComoEsGlobalFueraQuedaModificada y numGlobal vale "+numGlobal+"\n\n");
		
		
		modificaDentroYComoEsGlobalFueraQuedaModificada(numGlobal);
		
		System.out.println("Hemos salido de la funci�n modificaDentroYComoEsGlobalFueraQuedaModificada y numGlobal vale "+numGlobal+"\n\n");
		*/
	}

	public static int pideNumero()
	{
		int num=0;
		System.out.println("Introduce un n�mero: ");
		num=Entrada.entero();
		
		return num;
	}
	
	public static int sumaNumeros(int a, int b)
	{
		int suma;
		
		suma=a+b;
		
		return suma;
		
	}
	
	
	public static void imprimeResultadoSuma(int s)
	{
		
		System.out.println("\n\nLa suma de los n�meros es "+s+"\n\n");
	}
	
	public static void pideNumerosSumalosEImprimelos()
	{
		int num1=0,num2=0,sum=0;
		System.out.println("Introduce un n�mero: ");
		num1=Entrada.entero();
		
		System.out.println("Introduce un n�mero: ");
		num2=Entrada.entero();
		
		sum=num1+num2;
		
		System.out.println("\n\nLa suma de los n�meros es "+sum+"\n\n");		
	}
	
	public static void modificaDentroPeroFueraSigueIgual(int numA)
	{
		System.out.println("Estamos dentro de la funci�n y numA vale "+numA);
		
		numA=numA*100000;
		
		System.out.println("Estamos dentro de la funci�n, hemos modificado numA y ahora vale "+numA+"\n\n");
	}		
	
	public static void modificaDentroYComoEsGlobalFueraQuedaModificada(int nG)
	{
		System.out.println("Estamos dentro de la funci�n y nG vale "+nG);
		
		nG=nG*100000;
		
		System.out.println("Estamos dentro de la funci�n, hemos modificado nG y ahora vale "+nG+"\n\n");

	}
}
