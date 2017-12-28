import java.util.Scanner;

public class Uri1168 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int tCases = input.nextInt();
	int[] funcion = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	while(tCases > 0) {
	    int value = 0;
	    String number = input.next();
	    for (int i = 0; i < number.length(); i++)
		value += funcion[Character.getNumericValue(number.charAt(i))];
	    System.out.println(value + " leds");
	    tCases --;
	    value = 0;
	}
    }
}
