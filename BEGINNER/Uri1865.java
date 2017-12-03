import java.util.Scanner;
//only the mighty Thor can lift Mjölnir :) 
public class Uri1865 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int cases = input.nextInt();
	String linea = "";
	input.nextLine();
	while(cases > 0) {
	    linea = input.nextLine();
	    if(linea.contains("Thor"))
		System.out.println("Y");
	    else
		System.out.println("N");
	    cases --;
	}
    }
}
