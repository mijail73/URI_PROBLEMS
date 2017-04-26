import java.util.Scanner;

public class Uri1116 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	int a, b;
	float c;
	for (int i = 0; i < cases; i++) {
	    a = in.nextInt();
	    b = in.nextInt();
	    if(b == 0)
		System.out.println("divisao impossivel");
	    else {
		c = (float)a / b;
		System.out.printf("%.1f\n", c);
	    }
	}
    }
}
