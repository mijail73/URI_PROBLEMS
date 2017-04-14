import java.util.Scanner;
import java.io.IOException;

public class Uri1017 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int hrs = in.nextInt();
	int speed = in.nextInt();
	Double l = (double) hrs * speed / 12;
	System.out.printf("%.3f\n", l);
    }
}
