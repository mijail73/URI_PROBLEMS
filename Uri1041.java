import java.util.Scanner;
import java.io.IOException;

public class Uri1041 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	float x = in.nextFloat();
	float y = in.nextFloat();
	if(x == 0.0 && y == 0.0)
	    System.out.println("Origem");
	else if(x == 0.0)
	    System.out.println("Eixo Y");
	else if(y == 0.0)
	    System.out.println("Eixo X");
	else if(x > 0.0 && y > 0.0)
	    System.out.println("Q1");
	else if(x < 0.0 && y > 0.0)
	    System.out.println("Q2");
	else if(x < 0.0 && y < 0.0)
	    System.out.println("Q3");
	else if(x > 0.0 && y < 0.0)
	    System.out.println("Q4");
    }
}
