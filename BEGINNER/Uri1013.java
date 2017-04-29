import java.util.Scanner;
import java.io.IOException;

// REMEBER TO CHANGE all Uri1013 strings to Main for the Uri Judge
public class Uri1013 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String numbers = in.nextLine();
	String[] inumbers = numbers.split(" ");
	int A = Integer.parseInt(inumbers[0]);
	int B = Integer.parseInt(inumbers[1]);
	int C = Integer.parseInt(inumbers[2]);
	Uri1013 test = new Uri1013();
	if(test.maior(A, B) == A) {
	    if(test.maior(A, C) == A)
		System.out.println(A + " eh o maior");
	    else
		System.out.println(C + " eh o maior");
	} else {
	    if(test.maior(B, C) == B)
		System.out.println(B + " eh o maior");
	    else
		System.out.println(C + " eh o maior");	    
	}
    }

    public int maior(int a, int b) {
	int maior = (a + b + Math.abs(a - b)) / 2;
	return maior;
    }
}
