import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1006 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
        double A, B, X, C;
	float j;
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());
        X = (A * .2 + B * .3 + C * .5) / (1.0);
	j = (float) X;
        System.out.printf("MEDIA = %.1f\n", X);
    }
}
