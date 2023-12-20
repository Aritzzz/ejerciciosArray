public class ejercicioArray10 {

	public static void main(String[] args) {
		int tabla[]= {7,14,8,2,22,13,21};
		int divisionSiete=0;


		for(int i=0; i<tabla.length;i++)
			if (tabla[i]%7==0)
				divisionSiete++;
		
			
				System.out.println("Divisioble con siete: "+divisionSiete);
	
	}

}

