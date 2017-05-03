import java.util.Scanner;

public class Uri1153 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int factorial = in.nextInt();
	int facto = 0, factoAnterior = 1;
	for (int i = 0; i < factorial + 1; i++) {
	    if(i == 0)
		facto = 1;
	    else if(i == 1)
		facto = 1;
	    else
		facto = factoAnterior * i;
	    factoAnterior = facto;
	}
	System.out.println(facto);
    }
}
