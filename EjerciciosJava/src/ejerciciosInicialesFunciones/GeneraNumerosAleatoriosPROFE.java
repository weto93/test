package ejerciciosInicialesFunciones;

public class GeneraNumerosAleatoriosPROFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Qué número quiere generar?"
				+ "\nb)BINARIO"
				+ "\no)OCTAL"
				+ "\nd)DECIMAL"
				+ "\nh)HEXADECIMAL");
		char op=Entrada.caracter();
		generadorDeNumerosAleatorios(op);
	}

	public static void generadorDeNumerosAleatorios(char op)
	{
		long bin=0,oct=0,dec=0;
		int cifra;
		String car;
		String hex=new String(" ");
		switch(op) {
			case 'b':
				for(int i=0;i<4;i++)
				{
					cifra=generaDigitoAleatorioBin();
					bin+=(long)cifra*Math.pow(10, i);
				}
				System.out.println("El número binario es: "+bin);
				break;
			case 'o':
				for(int i=0;i<4;i++)
				{
					cifra=generaDigitoAleatorioOct();
					oct+=(long)cifra*Math.pow(10, i);
				}
				System.out.println("El número octal es: "+oct);
				break;
			case 'd':
				for(int i=0;i<4;i++)
				{
					cifra=generaDigitoAleatorioDec();
					dec+=(long)cifra*Math.pow(10, i);
				}
				System.out.println("El número decimal es: "+dec);
				break;
			case 'h':
				for(int i=0;i<4;i++)
				{
					car=generaDigitoAleatorioHex();
					hex+=car;
				}
				System.out.println("El número hexadecimal es: "+hex);
				break;
		}
	}
		
	public static int generaDigitoAleatorioBin()
	{
		return (int)Math.round(Math.random());
	}
	
	public static int generaDigitoAleatorioOct()
	{
		return (int)Math.round(Math.random()*8);
	}
	
	public static int generaDigitoAleatorioDec()
	{
		return (int)Math.round(Math.random()*9);
	}
	
	public static String generaDigitoAleatorioHex()
	{
		int digit=(int)Math.round(Math.random()*16);
		
		switch(digit) {
			case 0:
				return "0";
			case 1:
				return "1";
			case 2:
				return "2";
			case 3:
				return "3";
			case 4:
				return "4";
			case 5:
				return "5";
			case 6:
				return "6";
			case 7:
				return "7";
			case 8:
				return "8";
			case 9:
				return "9";
			case 10:
				return "A";
			case 11:
				return "B";
			case 12:
				return "C";
			case 13:
				return "D";
			case 14:
				return "E";
			case 15:
				return "F";
			default:
				return " ";
		}
	}
	
}
