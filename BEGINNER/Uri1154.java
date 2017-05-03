import java.util.Scanner;

public class Uri1154 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Double average, suma = 0.0, entry, elemns = 0.0;
	while(true){
	    entry = in.nextDouble();
	    if(entry < 0)
		break;
	    suma += entry;
	    elemns ++;
	}
	average = (double)((double)suma / (double)elemns);
	System.out.printf("%.2f\n", average);
    }
}
