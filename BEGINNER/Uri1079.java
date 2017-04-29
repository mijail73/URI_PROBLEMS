import java.util.Scanner;

public class Uri1079 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	float a = 0, b = 0, c = 0, aver = 0;
	for (int i = 0; i < cases; i++) {
	    a = in.nextFloat();
	    b = in.nextFloat();
	    c = in.nextFloat();
	    aver = (float) (a * .2 + b * .3 + c * .5);
	    System.out.printf("%.1f\n", aver);
	}
    }
}
