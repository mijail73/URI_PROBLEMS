import java.util.Scanner;

public class Uri1151 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int numbers = in.nextInt();
	int fibo, uno = 0, dos = 1;
	for (int i = 0; i < numbers; i++) {
	    if(i == 0)
		fibo = 0;
	    else if(i == 1)
		fibo = 1;
	    else
		fibo = uno + dos;
	    if(i < numbers - 1)
		System.out.print(fibo + " ");
	    else
		System.out.println(fibo);
	    uno = dos;
	    dos = fibo;
	}
    }
}
