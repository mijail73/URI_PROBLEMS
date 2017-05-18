import java.util.Scanner;

public class Uri1158 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	int X, Y;
	int suma = 0;
	while(true) {
	    X = in.nextInt();
	    Y = in.nextInt();
	    in.nextLine();
	    for (int i = 0; i < Y; i++) {
		if(X % 2 != 0) {
		    suma += X;
		} else {
		    X += 1;
		    suma += X;
		}
		X += 2;
	    }
	    System.out.println(suma);
	    suma = 0;
	    cases --;
	    if(cases == 0)
		break;
	}
    }
}
