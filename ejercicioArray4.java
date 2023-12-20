
public class ejercicioArray4 {
	  static String arrayToString(int[] array) {
	        return java.util.Arrays.toString(array);
	    }
	  
	public static void main(String[] args) {
		 int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
	        moverDerecha(tabla);
	        System.out.println("Como queda el array despues de rotar a la derecha: " + arrayToString(tabla));
	       	    }
	
	    static void moverDerecha(int[] array) {
	        int ultimoNumero = array[array.length - 1];
	  
	        System.arraycopy(array, 0, array, 1, array.length - 1);
	        array[0] = ultimoNumero;
	    }

	  
}