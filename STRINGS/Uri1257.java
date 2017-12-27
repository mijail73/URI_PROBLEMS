import java.util.Scanner;

public class Uri1257 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int nCases = input.nextInt();
	String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	while(nCases > 0) {
	    int nSubCases = input.nextInt();
	    int value = 0;
	    int element = 0;
	    while(nSubCases > 0) {
		String procesar = input.next();
		for (int i = 0; i < procesar.length(); i++) {
		    value += abc.indexOf(procesar.charAt(i)) + element + i;
		}
		element ++;
		nSubCases --;
	    }
	    System.out.println(value);
	    nCases --;
	}
    }

}
