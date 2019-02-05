package ejerciciosInicialesFunciones;

public class EdadFechasPROFE {
		static final int DIAHOY=9, MESHOY=12, ANYOHOY=2016;
				
		public static void main(String[] args) {
			
			// programa principal

				int dia, anyo, mes;
				String mesCad;
				
				System.out.println("Introduce un dia");
				dia=Entrada.entero();
				
				System.out.println("Introduce un mes en formato cadena");
				mesCad=Entrada.cadena();
				mes=pasaMesAEntero(mesCad);
				
				System.out.println("Introduce un año");
				anyo=Entrada.entero();
				
				while (!fechaCorrecta(dia, mes, anyo)){
					System.out.println("Fecha incorrecta, vuelva a introducir una fecha válida: ");
					System.out.println("Introduce un dia");
					dia=Entrada.entero();
					
					System.out.println("Introduce un mes en formato cadena");
					mesCad=Entrada.cadena();
					mes=pasaMesAEntero(mesCad);
					
					System.out.println("Introduce un año");
					anyo=Entrada.entero();
				}
				
																						
				calculoEdad(dia, mes, anyo);
		}

		
		
		
		//subprogramas:
		
		static boolean esBisiesto(int anyo1){
			
			if ((anyo1%4==0 && anyo1%100!=0) || ( anyo1%400==0)){
				return true; //envia que el año ES bisiesto
			}
			else {
				return false; //envia que el año NO es bisiesto
			}
		}

		static int diasMes(int mes1, int anyo1){
			
			if (mes1==1 || mes1==3 || mes1==5 || mes1==7 || mes1==8 || mes1==10 || mes1==12){
				return 31;
			}
			else if (mes1==4 || mes1==6 || mes1==9 || mes1==11){
				return 30;
			}
			else if (mes1==2){
				if (esBisiesto(anyo1)){
					return 29;
					}
				else{
					return 28;
					}
			}
			else{
				return -1;
			}
			
			
		}

		static int pasaMesAEntero(String mesCad1){
			int mes1;
			
			mesCad1=mesCad1.toLowerCase();
			
			switch(mesCad1)
			{
				case "enero": mes1=1;
				break;
				case "febrero": mes1=2;
				break;
				case "marzo": mes1=3;
				break;
				case "abril": mes1=4; 
				break;
				case "mayo": mes1=5;
				break;
				case "junio": mes1=6; 
				break;
				case "julio": mes1=7;
				break;
				case "agosto": mes1=8; 
				break;
				case "septiembre": mes1=9; 
				break;
				case "octubre": mes1=10; 
				break;
				case "noviembre": mes1=11; 
				break;
				case "diciembre": mes1=12; 
				break;
				default: mes1=-1;
				break;
			}
			return mes1;
		}

		static boolean fechaCorrecta(int dia1, int mes1, int anyo1){
			if (dia1>diasMes(mes1, anyo1) || dia1<1 || anyo1<0 || 
						anyo1>ANYOHOY || (anyo1==ANYOHOY && esMayor(dia1,mes1))){
					return false;
				}
			else{
				return true;
			}
		}
		
		static boolean esMayor(int dia1, int mes1)
		{
		if (mes1 > MESHOY)
			return true;
		if (mes1 == MESHOY) {
			if (dia1 > DIAHOY)
				return true;
			else
				return false;
		} else
			return false;
				
		}
		
		static void calculoEdad(int dia1, int mes1, int anyo1){
			int edad1;
			
			edad1=ANYOHOY-anyo1;
			
			if(esMayor(dia1,mes1))
				edad1--;
			
			System.out.println("Su edad es: "+edad1);
		}
}

