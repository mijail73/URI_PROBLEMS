import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1002 {
    
    public static void main(String[] args) throws IOException { 
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);        
	double pi = 3.14159;
	double r;
	double a;        
	float j;
        r = Double.parseDouble(in.readLine());        
        a = pi * (r * r);
	j = (float) a;
	System.out.printf("A=%.4f\n", a);
    }    
}
