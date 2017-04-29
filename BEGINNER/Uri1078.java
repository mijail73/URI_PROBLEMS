import java.util.Scanner;

public class Uri1078 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	for (int i = 1; i < 11; i++) {
	    System.out.println(i + " x " + entry + " = " + entry * i);
	}
    }
}
