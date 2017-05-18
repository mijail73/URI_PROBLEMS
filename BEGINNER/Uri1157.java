import java.util.Scanner;

public class Uri1157 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	for (int i = 1; i < entry + 1; i++) {
	    if(entry % i == 0)
		System.out.println(i);
	}
    }
}
