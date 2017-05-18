import java.util.Scanner;

public class Uri1176 {
    
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	long fib;
	while(true) {
	    fib = in.nextLong();
	    if(fib == 0)
		System.out.println("Fib(0) = 0");
	    else if(fib == 1)
		System.out.println("Fib(1) = 1");
	    else {
		long[] fibo = new long[(int)fib + 1];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
		    fibo[i] = fibo[i - 2] + fibo[i - 1];
		}
		System.out.printf("Fib(%d) = %d\n", fib, fibo[(int)fib]);
	    }
	    cases --;
	    if(cases == 0)
		break;
	}
    }
}
