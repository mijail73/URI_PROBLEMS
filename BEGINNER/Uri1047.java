import java.util.Scanner;

public class Uri1047 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();
	int d = in.nextInt();
	int hours, minutes;
	if(c > a)
	    hours = c - a;
	else if(a == c)
	    hours = 23;
	else
	    hours = (c - a) + 24;
	if(d > b) {
	    minutes = d - b;
	}
	else if(b == d) {
	    minutes = 0;
	    hours ++;
	}
	else {
	    minutes = (d - b) + 60;
	    hours --;
	}
	System.out.println("O JOGO DUROU " + hours +
			   " HORA(S) E " + minutes + " MINUTO(S)");
    }
}
