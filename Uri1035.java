import java.util.Scanner;
import java.io.IOException;

public class Uri1035 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int A = in.nextInt();
	int B = in.nextInt();
	int C = in.nextInt();
	int D = in.nextInt();
	if((B > C) && (D > A) && (C + D > A + B) && (C > -1) && (D > -1)
	   && (A % 2 == 0))
	    System.out.println("Valores aceitos");
	else
	    System.out.println("Valores nao aceitos");
    }
}
