import java.util.Scanner;

public class Uri1064 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int postive = 0;
	float entry, average = 0;
	for (int i = 0; i < 6; i++) {
	    entry = in.nextFloat();
	    if(entry >= 0) {
		postive ++;
		average += entry;
	    }
	}
	System.out.println(postive + " valores positivos");
	System.out.printf("%.1f\n", average / postive);
    }
}
