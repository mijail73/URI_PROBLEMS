import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1007 {
    
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	int A, B, C, D, X;
	A = Integer.parseInt(in.readLine());
	B = Integer.parseInt(in.readLine());
	C = Integer.parseInt(in.readLine());
	D = Integer.parseInt(in.readLine());
	X = A * B - C * D;
	System.out.printf("DIFERENCA = %d\n", X);
    }
}
