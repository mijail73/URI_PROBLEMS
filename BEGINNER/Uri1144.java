import java.util.Scanner;

public class Uri1144 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	for (int i = 1; i < entry + 1; i++) {
	    System.out.println(i + " " + (int) Math.pow(i, 2) +
			       " " + (int) Math.pow(i, 3));
	    System.out.println(i + " " + ((int) Math.pow(i, 2) + 1) +
			       " " + ((int) Math.pow(i, 3) + 1));
	}
    }
}
