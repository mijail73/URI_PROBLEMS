import java.util.Scanner;

public class Uri1175 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] arreglo = new int[20];
	int[] arregloMod = new int[20];
	for (int i = 0; i < arreglo.length; i++) {
	    arreglo[i] = in.nextInt();
	}
	for (int i = 0; i < arreglo.length; i++) {
	    arregloMod[i] = arreglo[19 - i];
	    System.out.printf("N[%d] = %d\n", i, arregloMod[i]);
	}
    }
}
