import java.util.Scanner;

public class Uri1164 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	int test;
	int suma = 0;
	while(true) {
	    test = in.nextInt();
	    //Positive divisors sum
	    for (int i = 1; i < test; i++) {
		if(test % i == 0)
		    suma += i;
	    }
	    if(suma == test)
		System.out.println(test + " eh perfeito");
	    else
		System.out.println(test + " nao eh perfeito");
	    suma = 0;
	    cases --;
	    if(cases == 0)
		break;
	}
    }
}
