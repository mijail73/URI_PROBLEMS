import java.util.Scanner;

public class Uri1071 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int sum = 0;
	if(a > b) {
	    for (int i = b + 1; i < a; i++) {
		if(i % 2 != 0)
		    sum += i;
	    }
	} else {
	    for (int i = a + 1; i < b; i++) {
		if(i % 2 != 0)
		    sum += i;
	    }
	}
	System.out.println(sum);
    }
}
