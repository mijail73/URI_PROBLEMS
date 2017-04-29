import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1005 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
        double A, B, X;
	float j;
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        X = (A * .35 + B * .75) / (1.1);
	j = (float) X;
        System.out.printf("MEDIA = %.5f\n", X);
    }
}
