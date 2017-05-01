import java.util.Scanner;

public class Uri1132 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int suma = 0;
	if(Math.max(a, b) == a) {
	    for (int i = b; i < a + 1; i++) {
		if(i % 13 != 0)
		    suma += i;
	    }
	} else {
	    for (int i = a; i < b + 1; i++) {
		if(i % 13 != 0)
		    suma += i;
	    }
	}
	System.out.println(suma);
    }
}
