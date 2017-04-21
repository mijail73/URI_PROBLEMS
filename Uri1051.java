import java.util.Scanner;

public class Uri1051 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float entry = in.nextFloat();
	float tax = 0;
	if(entry <= 2000)
	    System.out.println("Isento");
	else {
	    if(entry > 4500) {
		tax += (entry - 4500) * .28;
		entry = 4500;
	    }
	    if(entry > 3000) {
		tax += (entry - 3000) * .18;
		entry = 3000;
	    }
	    if(entry > 2000) {
		tax += (entry - 2000) * .08;
		entry = 2000;
	    }
	    System.out.printf("R$ %.2f\n", tax);
	}
    }
}
