
public class ejercicioArray2 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14,25,2};
		int suma1=0;
		int suma2=0;
		
		for (int i=0; i<5; i++)
		
			suma1= suma1+tabla[i];
			System.out.println("La suma de la primera parte es: "+suma1);
		
		for (int i=5; i<tabla.length; i++)
				
			suma2= suma2+tabla[i];
			System.out.println("La suma de la segunda parte es: "+suma2);
			
			if(suma1>suma2)	
			System.out.println("La primera parte es mas grande");
				
				else
					if(suma1<suma2)	
						System.out.println("La segunda parte es mas grande");
				
					else
						System.out.println("Son iguales");
				
	}

}
