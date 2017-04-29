import java.util.Scanner;
import java.io.IOException;

public class Uri1043 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	float A = in.nextFloat();
	float B = in.nextFloat();
	float C = in.nextFloat();
	// Trinagle Inequality Theorem
	if(A + B > C && A + C > B && B + C > A) {
	    float perimetro = A + B + C;
	    System.out.printf("Perimetro = %.1f\n", perimetro);
	} else {
	    float areaTrapezium = (A + B) / 2 * C;
	    System.out.printf("Area = %.1f\n", areaTrapezium);
	}
    }
}
