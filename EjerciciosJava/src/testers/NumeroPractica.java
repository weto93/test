package testers;

public class NumeroPractica {

	public static void main(String[] args) {
		
		final int MAX = 10;
		int i, j, lim;
		i = 0;
		lim = MAX;
		do {
			for (j = 0; j < lim; j += 1) {
				if(i % 2 == 0)
					i++;
				else
					i += 3;
			}
			lim -= 2;
		}
		while(lim > 0);
	}

}
