import java.util.Scanner;

public class Uri1115 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	while(a != 0 && b != 0) {
	    if(a > 0 && b > 0) 
		System.out.println("primeiro");
	    else if(a < 0 && b > 0)
		System.out.println("segundo");
	    else if(a < 0 && b < 0)
		System.out.println("terceiro");
	    else
		System.out.println("quarto");
	    a = in.nextInt();
	    b = in.nextInt();
	}
    }
}
