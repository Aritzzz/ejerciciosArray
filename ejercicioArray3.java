public class ejercicioArray3 {

	public static void main(String[] args) {
		int tabla[]={3,6,2,77,3,10,23,14};
		int numeroIguales=0;
		boolean repetidos=false;

		for(int i=0; i<tabla.length-1;i++)
			for(int j=i+1; j<tabla.length;j++)	
			if (tabla[i]==tabla[j])
				repetidos=true;

		System.out.println("Numero iguales: "+repetidos);
	}
}
