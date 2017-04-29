import java.util.Scanner;

public class Uri1080 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n, aux = 0, highest = 0, pos = 0;
	for (int i = 0; i < 100; i++) {
	    n = in.nextInt();
	    if(n > aux) {
		highest = n;
		pos = i + 1;
		aux = n;
	    }
	}
	System.out.println(highest);
	System.out.println(pos);
    }
}
