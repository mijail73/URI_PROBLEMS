import java.util.Scanner;

public class Uri1174 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float[] arreglo = new float[100];
	for (int i = 0; i < arreglo.length; i++) {
	    arreglo[i] = in.nextFloat();
	}
	for (int i = 0; i < arreglo.length; i++) {
	    if(arreglo[i] <= 10)
		System.out.printf("A[%d] = %.1f\n", i, arreglo[i]);
	}
    }
}
