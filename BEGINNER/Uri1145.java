import java.util.Scanner;

public class Uri1145 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int columns = in.nextInt();
	int limit = in.nextInt();
	for (int i = 1; i < limit + 1; i++) {
	    if(i % columns != 0)
		System.out.print(i + " ");
	    else
		System.out.println(i);
	}
    }
}
