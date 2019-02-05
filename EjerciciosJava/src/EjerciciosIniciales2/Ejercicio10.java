package EjerciciosIniciales2;

public class Ejercicio10 {

	public static void main(String[] args) {
		String jugador1, jugador2;
		
		System.out.println("(JUGADOR1) Escribe: piedra, papel o tijeras");
		jugador1=Entrada.cadena();
		
		System.out.println("(JUGADOR2) Escribe: piedra, papel o tijeras");
		jugador2=Entrada.cadena();
		
		if((jugador1.equals("piedra") && jugador2.equals("papel"))||(jugador1.equals("tijeras") && jugador2.equals("piedra"))||(jugador1.equals("papel") && jugador2.equals("tijeras"))) {
			System.out.println("El jugador2 ha ganado la partida");
		}
		if((jugador1.equals("piedra") && jugador2.equals("tijeras"))||(jugador1.equals("tijeras") && jugador2.equals("papel"))||(jugador1.equals("papel") && jugador2.equals("piedra"))) {
			System.out.println("El jugador1 ha ganado la partida");
		}
		if((jugador1.equals("piedra") && jugador2.equals("piedra"))||(jugador1.equals("papel") && jugador2.equals("papel"))||(jugador1.equals("tijeras") && jugador2.equals("tijeras")) ) {
			System.out.println("Habéis empatado");
		}
		
	}

}
