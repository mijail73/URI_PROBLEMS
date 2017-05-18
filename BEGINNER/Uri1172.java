import java.util.Scanner;

public class Uri1172 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] arreglo = new int[10];
	int entry;
	for (int i = 0; i < arreglo.length; i++) {
	    entry = in.nextInt();
	    if(entry <= 0)
		entry = 1;
	    arreglo[i] = entry;
	}
	for (int i = 0; i < arreglo.length; i++) {
	    System.out.printf("X[%d] = %d\n", i, arreglo[i]);
	}
    }
}
