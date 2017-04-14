import java.util.Scanner;
import java.io.IOException;

public class Uri1018 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int res = 0;
	int reminder = -1;
	System.out.println(n);
	res = n / 100;
	n = n % 100;
	System.out.println(res + (" nota(s) de R$ 100,00"));
	res = n / 50;
	n = n % 50;
	System.out.println(res + (" nota(s) de R$ 50,00"));
	res = n / 20;
	n = n % 20;
	System.out.println(res + (" nota(s) de R$ 20,00"));
	res = n / 10;
	n = n % 10;
	System.out.println(res + (" nota(s) de R$ 10,00"));
	res = n / 5;
	n = n % 5;
	System.out.println(res + (" nota(s) de R$ 5,00"));
	res = n / 2;
	n = n % 2;
	System.out.println(res + (" nota(s) de R$ 2,00"));
	res = n / 1;
	n = n % 1;
	System.out.println(res + (" nota(s) de R$ 1,00"));
    }
}
