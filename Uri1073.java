import java.util.Scanner;

public class Uri1073 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	for (int i = 2; i < entry + 1; i++) {
	    if(i % 2 == 0)
		System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
	}
    }
}
