package cadenas;

public class ejemplosCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cadena={'p','a','c','o'};
		System.out.println(cadena);
		String cadena1="paco"; //mejor new String("paco");
		String cadena2=new String("paco");
		System.out.println(cadena1);
		
		
		
		System.out.println(cadena[0]);
		//System.out.println(cadena1[0]);
		
		//m�todo length()
		String cad1=new String("Juan");
		System.out.println("El tama�o de la cadena "+cad1+
				" es "+cad1.length());
		
		//m�todo concat(String str)
		String cad2=new String(" Antonio");
		String cad3=new String(" L�pez");
		cad1=cad1.concat(cad2).concat(cad3);
		String cad4=cad1+cad2+cad3;
		
		//m�todo compareTo(String str)
		if(cad2.compareTo(cad3)>0)
			System.out.println(cad2+" es mayor que "+cad3);
		else if(cad2.compareTo(cad3)<0)
			System.out.println(cad2+" es menor que "+cad3);
		else //cad2.compareTo(cad3)==0
			System.out.println("Ambas cadenas son iguales");
		
		//m�todo toLowerCase y toUpperCase
		System.out.println("El nombre en min�scula es "+cad1.toLowerCase());
		
		//m�todo trim()
		cad1=cad1.trim();

		
		//m�todo replace(char antCarac,char newCarac)
		String cad5=new String("Aes min�sculas a aes may�sculas");
		cad5=cad5.replace("a","A"); //reemplaza la primera ocurrencia
		cad5=cad5.replaceAll("m"," ");
		System.out.println(cad5);
		
		//m�todo substring(int posIni, int posFin)
		String cad6=new String("hola que tal, muy bien");
		System.out.println(cad6.substring(5,14));
		
		//m�todo starsWith(String subcad) y endsWith(String subcad)
		if(cad5.startsWith("Aes"))
			System.out.println("La cadena "+cad5+" empieza con Aes");
		else
			System.out.println("La cadena "+cad5+" no empieza con Aes");
			
		//m�todo charAt(int pos)
		System.out.println(cad5.charAt(0));
		
		//m�todo int indexOf(char car) o indexOf(String subCad)
		System.out.println("La letra J may�sucula en"
				+cad1+" est� en la posici�n "+cad1.indexOf('J'));
		System.out.println("La subcadena Jor en"
				+cad1+" est� en la posici�n "+cad1.indexOf("ant"));
		
		//m�todo char[] toCharArray()
		char[] vectorCaracteres=cad1.toCharArray();
		for(int i=0; i<vectorCaracteres.length; i++)
			System.out.print(vectorCaracteres[i]);
		
		
		String cadPri=new String("hola que tal");
		String cadSeg=new String(", muy bien con okal");
		
		//prueba friki
		if(cadPri.concat(cadSeg)
				.substring(6,17)
				.substring(1,2)
				.startsWith("ho")==false)
			System.out.println("Contiene una k");
	}

}
