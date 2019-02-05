package examenrec14ene;

public class carrera {

	public static final int TAMCIRCUITO=11;
	
	public static void main(String[] args) {
		
		int fichaJ1, fichaJ2, minDado=1, maxDado=6, tirada1=0, tirada2=0;
		
		String nomJ1="", nomJ2="";
		
		System.out.println("BIENVENIDO A LA CARRERA DEL SIGLO!!");
		
		tirada1=tiraDados();
		
		System.out.println("Escribe el nombre del jugador1:");
		nomJ1=Entrada.cadena();
		
		System.out.println("Escribe el nombre del jugador2:");
		nomJ2=Entrada.cadena();
		
		while(nomJ2.equals(nomJ1)) {
			
			System.out.println("Ambos jugadores no pueden llamarse igual!");
			
			System.out.println("Escribe el nombre del jugador2:");
			nomJ2=Entrada.cadena();
			
			
		}
		
		System.out.println("COMENCEMOS A JUGAR!!");
	
		PintaPista();
		
		System.out.println("Turno jugador 1 "+nomJ1);
		System.out.println("Ha sacado un "+tirada1+" en su primera tirada!");
		System.out.println("Ha sacado un "+tirada2+" en su segunda tirada!");
		
		System.out.println("Turno jugador 2 "+nomJ1);
		tirada1=tiraDados();
		tirada2=tiraDados();
		
		System.out.println("Ha sacado un "+tirada1+" en su primera tirada!");
		System.out.println("Ha sacado un "+tirada2+" en su segunda tirada!");
		
		
		sumaDeNumerosEsPrimo(tirada1, tirada2);
		
		
		
		
		
	}
	
	public static int tiraDados(){
		
		int minDado=0, maxDado=0, valorIntermedio=0;
		
		System.out.println("¿Cuál es el número mínimo de tu dado?");
		minDado=Entrada.entero();
		
		System.out.println("¿Cuál es el número máximo de tu dado?");
		maxDado=Entrada.entero();
		
		valorIntermedio=(int)Math.floor(Math.random()*6+1);
		
		return valorIntermedio;
		
	}
	
	
	
	public static void PintaPista() {
		
		int j1=2, j2=10;
		
		for(int i=0; i<=TAMCIRCUITO;i++) {
			
			System.out.print("\t"+i);
			
		}
		
		System.out.println();
		
		for(int h=0;h<=TAMCIRCUITO;h++) {
			
			System.out.print("\t ");
			
			if(h==(j1-1)) {
				System.out.print("\tJ1");
			}
		}
		
		System.out.println();
		
		for(int h=0;h<=TAMCIRCUITO;h++) {
			
			System.out.print("\t ");
			
			if(h==(j2-1)) {
				System.out.print("\tJ2");
			}
		}
		
		System.out.println();
		
	}
	
	
	
	public static boolean sumaDeNumerosEsPrimo(int a, int b) {
		
		int suma, i=2;
		boolean esPrimo1 = false,esPrimo2 = false;
		
		
		while(i<=(a/2+1) && a%i!=0)
			i++;
		
		if(i>(a/2+1))
			esPrimo1=true;
		
		i=2;
		
		while(i<=(b/2+1) && b%i!=0)
			i++;
		
		if(i>(b/2+1))
			esPrimo2=true;
		
		i=2;
		
		
		if(esPrimo1==true && esPrimo2==true) {
			
			suma=a+b;
		}
		
		return true;
		
	}
	
	public static String esGanador(String nomJ1, String nomJ2) {
		
		if(nomJ1.equals(nomJ2)) {}
		
		return nomJ2;
		
	}
	/*
	public static int imprimeComoVaLaCarrera() {
		
	}
	
	public static int Principal() {
		
	}
	*/
}
