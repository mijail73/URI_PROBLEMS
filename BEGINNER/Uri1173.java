import java.util.Scanner;

public class Uri1173 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	int[] arreglo = new int[10];
	for (int i = 0; i < arreglo.length; i++) {
	    arreglo[i] = entry;
	    entry *= 2;
	}
	for (int i = 0; i < arreglo.length; i++) {
	    System.out.printf("N[%d] = %d\n", i, arreglo[i]);
	}
    }
}
