import java.util.Scanner;
import java.io.IOException;

public class Uri1011 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Double pi = 3.14159;
	Double fraction = 4.0/3;
	Double radius = in.nextDouble();
	Double volume = fraction * pi * Math.pow(radius,3);
	System.out.printf("VOLUME = %.3f\n", volume);
    }
}
