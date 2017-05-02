import java.util.Scanner;

public class Uri1149 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int n = in.nextInt();
	int suma = 0;
	while(n < 0 || n == 0)
	    n = in.nextInt();
	for (int i = 0; i < n; i++) {
	    suma += a;
	    a += 1;
	}
	System.out.println(suma);
    }
}
