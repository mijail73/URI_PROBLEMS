import java.util.Scanner;

public class Uri1142 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int rows = in.nextInt();
	for (int i = 1; i < rows * 4 + 1; i++) {
	    if(i % 4 != 0)
		System.out.print(i + " ");
	    else
		System.out.println("PUM");
	}
    }
}
