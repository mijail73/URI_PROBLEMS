import java.util.Scanner;

public class Uri1113 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	while(a != b) {
	    if(a > b)
		System.out.println("Decrescente");
	    else
		System.out.println("Crescente");
	    a = in.nextInt();
	    b = in.nextInt();
	}
    }
}
