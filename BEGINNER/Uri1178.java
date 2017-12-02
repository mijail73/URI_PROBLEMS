import java.util.Scanner;

public class Uri1178 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Double t = input.nextDouble();
	for (int i = 0; i < 100; i++) {
	    System.out.format("N[" + i + "] = %.4f%n", t);
	    t /= 2;
	}
    }
}
