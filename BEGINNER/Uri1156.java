public class Uri1156 {
    public static void main(String[] args) {
	Double suma = 1.0;
	int elevado = 1;
	int potencia;
	for (int i = 3; i < 40; i += 2) {
	    potencia = (int) Math.pow(2, elevado);
	    suma += (double) i/potencia;
	    elevado ++;
	}
	System.out.printf("%.2f\n", suma);
    }
}
