import java.util.Scanner;

public class Uri1094 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	Double amount, total = 0.0, c = 0.0, r = 0.0, s = 0.0;
	Double avec, aver, aves;
	String type;
	for (int i = 0; i < cases; i++) {
	    amount = in.nextDouble();
	    type = in.next();
	    total += amount;
	    if(type.equals("C"))
		c += amount;
	    else if(type.equals("R"))
		r += amount;
	    else
		s += amount;
	}
	avec = c * 100 / total;
	aver = r * 100 / total;
	aves = s * 100 / total;
	System.out.printf("Total: %.0f cobaias\n", total);
	System.out.printf("Total de coelhos: %.0f\n", c);
	System.out.printf("Total de ratos: %.0f\n", r);
	System.out.printf("Total de sapos: %.0f\n", s);
	System.out.printf("Percentual de coelhos: %.2f %%\n", avec);
	System.out.printf("Percentual de ratos: %.2f %%\n", aver);
	System.out.printf("Percentual de sapos: %.2f %%\n", aves);
    }
}
