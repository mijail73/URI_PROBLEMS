import java.util.Scanner;

public class Uri1048 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float entry = in.nextFloat();
	float total;
	int percent;
	float reajuste;
	if(entry >= 0 && entry <= 400.00) {
	    total = (float)((entry * 0.15) + entry);
	    percent = 15;
	    reajuste = (float) (entry * 0.15);
	} else if(entry > 400.00 && entry <= 800.00) {
	    total = (float)((entry * 0.12) + entry);
	    percent = 12;
	    reajuste = (float) (entry * 0.12);
	} else if(entry > 800.00 && entry <= 1200.00) {
	    total = (float)((entry * 0.10) + entry);
	    percent = 10;
	    reajuste = (float) (entry * 0.10);
	} else if(entry > 1200.00 && entry <= 2000.00) {
	    total = (float)((entry * 0.07) + entry);
	    percent = 7;
	    reajuste = (float) (entry * 0.07);
	} else {
	    total = (float)((entry * 0.04) + entry);
	    percent = 4;
	    reajuste = (float) (entry * 0.04);
	}
	System.out.printf("Novo salario: %.2f\n", total);
	System.out.printf("Reajuste ganho: %.2f\n", reajuste);
	System.out.println("Em percentual: " + percent + " %");
    }
}
