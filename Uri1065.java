import java.util.Scanner;

public class Uri1065 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entrada, valores = 0;
	for (int i = 0; i < 5; i++) {
	    entrada = in.nextInt();
	    if(entrada % 2 == 0)
		valores ++;
	}
	System.out.println(valores + " valores pares");
    }
}
