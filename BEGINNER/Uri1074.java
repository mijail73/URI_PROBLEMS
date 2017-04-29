import java.util.Scanner;

public class Uri1074 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	for (int i = 0; i < cases; i++) {
	    int caseN = in.nextInt();
	    if(caseN == 0)
		System.out.println("NULL");
	    else if(caseN % 2 == 0 && caseN > 0)
		System.out.println("EVEN POSITIVE");
	    else if(caseN % 2 == 0 && caseN < 0)
		System.out.println("EVEN NEGATIVE");
	    else if(caseN % 2 != 0 && caseN < 0)
		System.out.println("ODD NEGATIVE");
	    else
		System.out.println("ODD POSITIVE");
	}
    }
}
