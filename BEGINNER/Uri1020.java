import java.util.Scanner;
import java.io.IOException;

public class Uri1020 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int anos = n / 365;
	System.out.println(anos + " ano(s)");
	n = n % 365;
	int meses = n / 30;
	System.out.println(meses + " mes(es)");
	int dias = n % 30;
	System.out.println(dias + " dia(s)");
    }
}
