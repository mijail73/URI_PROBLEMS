import java.util.Scanner;

public class Uri1165 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	int test;
	boolean prime = true;
	while(true){
	    test = in.nextInt();
	    for (int i = 2; i < test; i++) {
		if(test % i == 0)
		    prime = false;
	    }
	    if(prime == true)
		System.out.println(test + " eh primo");
	    else
		System.out.println(test + " nao eh primo");
	    prime = true;
	    cases --;
	    if(cases == 0)
		break;
	}
    }
}
