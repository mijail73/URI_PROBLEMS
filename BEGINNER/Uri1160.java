import java.util.Scanner;

public class Uri1160 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	in.nextLine();
	while(cases > 0) {
	    String[] numbers = in.nextLine().split(" ");
	    int a = Integer.parseInt(numbers[0]);
	    int b = Integer.parseInt(numbers[1]);
	    Double percentA = Double.parseDouble(numbers[2]);
	    Double percentB = Double.parseDouble(numbers[3]);
	    int años = 0;
	    while(a <= b) {
		a += (a * percentA / 100);
		b += (b * percentB / 100);
		años ++;
		if(años > 100) {
		    System.out.println("Mais de 1 seculo.");
		    break;
		}
	    }
	    if(años <= 100)
		System.out.println(años + " anos.");
	    cases --;
	}
    }
}
