import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1003 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
        int A, B, X;
        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        X = A + B;
        System.out.printf("SOMA = %d\n", X);
    }
}
