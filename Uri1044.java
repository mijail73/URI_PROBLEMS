import java.util.Scanner;
import java.io.IOException;

public class Uri1044 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int A = in.nextInt();
	int B = in.nextInt();
	int max = (Math.max(A, B));
	if(max == A && A % B == 0)
	    System.out.println("Sao Multiplos");
	else if(max == B && B % A == 0)
	    System.out.println("Sao Multiplos");
	else
	    System.out.println("Nao sao Multiplos");
    }
}
