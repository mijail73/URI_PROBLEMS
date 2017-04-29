import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class Uri1045 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Double fst = in.nextDouble();
	Double snd = in.nextDouble();
	Double trd = in.nextDouble();
	Double[] entry = {fst, snd, trd};
	Arrays.sort(entry);
	Double A, B, C;
	C = entry[0];
	B = entry[1];
	A = entry[2];
	
	if(A >= B + C)
	    System.out.println("NAO FORMA TRIANGULO");
	else if(A * A == B * B + C * C)
	    System.out.println("TRIANGULO RETANGULO");
	else if(A * A > B * B + C * C)
	    System.out.println("TRIANGULO OBTUSANGULO");
	else if(A * A < B * B + C * C)
	    System.out.println("TRIANGULO ACUTANGULO");
	if(A.equals(B) && A.equals(C) && B.equals(C))
	    System.out.println("TRIANGULO EQUILATERO");
	else if(A.equals(B) || A.equals(C) || B.equals(C))
	    System.out.println("TRIANGULO ISOSCELES");
    }
}
