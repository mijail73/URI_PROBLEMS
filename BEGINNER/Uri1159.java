import java.util.Scanner;

public class Uri1159 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int suma = 0;
	while(true) {
	    int test = in.nextInt();
	    if(test == 0)
		break;
	    if(test % 2 != 0)
		test += 1;
	    for (int i = 0; i < 5; i++) {
		suma += test;
		test += 2;
	    }
	    System.out.println(suma);
	    suma = 0;
	}
    }
}
