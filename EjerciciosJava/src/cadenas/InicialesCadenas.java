package cadenas;

public class InicialesCadenas {
	
	public static void main(String[] args) {
	/*	
	System.out.println(correo());
		*/
	System.out.println("Escribe una cadena que contenga vocales");
	String vocales=new String(Entrada.cadena());
	
	/*System.out.println("Su cadena contiene "+devuelveVocales(vocales)+" vocales.");*/
	
	/*System.out.println(caracterSeparado(vocales));*/
	
	combinacionesPosibles(vocales);
	
	}

	public static String correo()  {
		
		System.out.println("Introduzca nombre:");
		String cadena1=new String(Entrada.cadena());
		System.out.println("Introduzca dominio: ");
		String cadena2=new String(Entrada.cadena());
		System.out.println("Introduzca TLD: ");
		String cadena3=new String(Entrada.cadena());
		
		cadena1=cadena1.concat("@");
		
		cadena1=cadena1.concat(cadena2.concat(cadena3));
		
		return cadena1.toLowerCase().trim();
	}
	
	public static int devuelveVocales(String vocales){
		
		int i=0, h=0, cuentaVocales=0;
		String temp=new String();
		
		while(i<vocales.length()) {
			i++;
			temp=vocales.substring(h, i);
			h++;
			if(temp.equals("a")||temp.equals("e")||temp.equals("i")||temp.equals("o")||temp.equals("u")) {
				cuentaVocales++;
			}
		}
		
		return cuentaVocales;
	}
	
	public static String caracterSeparado(String vocales) {
		
		String temp=new String();
		String todoJunto=new String();
		
		for(int i=0,j=0;i<vocales.length();i++) {
			j++;
			temp=vocales.substring(i, j);
			todoJunto=todoJunto.concat(temp.concat("-").trim());
			
		}
		
		return todoJunto;
	}
	
	public static void combinacionesPosibles(String vocales) {
		
		int i=0, h=0;
		String temp=new String();
		
		
		StringBuffer copia=new StringBuffer(vocales);
		StringBuffer copia2=new StringBuffer(copia);
		StringBuffer copia3=new StringBuffer(copia2);
		StringBuffer copia4=new StringBuffer(copia3);
		StringBuffer copia5=new StringBuffer(copia4);
		while(i<vocales.length()) {
			i++;
			temp=vocales.substring(h, i);
			h++;
			if(temp.equals("a")||temp.equals("e")||temp.equals("i")||temp.equals("o")||temp.equals("u")) {
				
				copia.setCharAt(h-1, 'a');
				copia2.setCharAt(h-1, 'e');
				copia3.setCharAt(h-1, 'i');
				copia4.setCharAt(h-1, 'o');
				copia5.setCharAt(h-1, 'u');
				
			}
			
		}
		
		System.out.println(copia);
		System.out.println(copia2);
		System.out.println(copia3);
		System.out.println(copia4);
		System.out.println(copia5);
	}
	
}
