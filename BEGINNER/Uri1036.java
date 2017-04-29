import java.util.Scanner;
import java.io.IOException;

public class Uri1036 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Double A = in.nextDouble();	
	Double B = in.nextDouble();
	Double C = in.nextDouble();
	Double r1, r2, delta, sqr;
	delta = Math.pow(B, 2) - 4 * A * C;
	sqr = Math.sqrt(delta);
	if(A == 0.0 || delta < 0)
	    System.out.println("Impossivel calcular");
	else {
	    r1 = (-B + sqr) / (2 * A);
	    r2 = (-B - sqr) / (2 * A);
	    System.out.printf("R1 = %.5f\n", r1);
	    System.out.printf("R2 = %.5f\n", r2);
	}
    }
}
