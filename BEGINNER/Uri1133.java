import java.util.Scanner;

public class Uri1133 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	if(Math.max(a, b) == a) {
	    for (int i = b + 1; i < a; i++) {
		if(i % 5 == 2 || i % 5 == 3)
		    System.out.println(i);
	    }
	} else {
	    for (int i = a + 1; i < b; i++) {
		if(i % 5 == 2 || i % 5 == 3)
		    System.out.println(i);
	    }
	}
    }
}
