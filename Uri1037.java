import java.util.Scanner;
import java.io.IOException;

public class Uri1037 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Double n = in.nextDouble();
	if(n < 0 || n > 100)
	    System.out.println("Fora de intervalo");
	else if(n >= 0 && n <= 25)
	    System.out.println("Intervalo [0,25]");
	else if(n > 25 && n <= 50)
	    System.out.println("Intervalo (25,50]");
	else if(n > 50 && n <= 75)
	    System.out.println("Intervalo (50,75]");
	else
	    System.out.println("Intervalo (75,100]");
    }
}
