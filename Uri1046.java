import java.util.Scanner;

public class Uri1046 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int hours;
	if(b > a)
	    hours = b - a;
	else if(a == b)
	    hours = 24;
	else
	    hours = b - a + 24;
	System.out.println("O JOGO DUROU " + hours + " HORA(S)");
    }
}
