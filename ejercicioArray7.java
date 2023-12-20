
public class ejercicioArray7 {
	
		public static void main(String[] args) {
			int tabla[]={3,6,2,77,3,10,23,14};
			int par=0;
			int impar=0;
			
			for(int i=0;i<tabla.length;i++)
				if (tabla[i]%2==0)
					par++;
				else impar++;

			System.out.println("Hay: "+par+" par");
			System.out.println("Hay: "+impar+" impares");
			
			if(par>impar)	
				System.out.println("Hay mas pares");
					
					else
						if(par<impar)	
							System.out.println("Hay mas impares");
					
						else
							System.out.println("Son iguales");

		}

	}


