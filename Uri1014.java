import java.util.Scanner;
import java.io.IOException;

public class Uri1014 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int km = in.nextInt();
	float l = in.nextFloat();
	Double aver = (double) km / l;
	System.out.printf("%.3f km/l\n", aver);
    }
}
