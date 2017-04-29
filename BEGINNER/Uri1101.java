import java.util.Scanner;

public class Uri1101 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int sum = 0;
	while(a > 0 && b > 0) {
	    if(a > b) {
		for (int i = b; i < a + 1; i++) {
		    System.out.print(i + " ");
		    sum += i;
		}
		System.out.println("Sum=" + sum);
	    } else {
		for (int i = a; i < b + 1; i++) {
		    System.out.print(i + " ");
		    sum += i;
		}
		System.out.println("Sum=" + sum);
	    }
	    a = in.nextInt();
	    b = in.nextInt();
	    sum = 0;
	}
    }
}
