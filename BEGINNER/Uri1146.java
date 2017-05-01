import java.util.Scanner;

public class Uri1146 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	while(entry != 0) {
	    for (int i = 1; i < entry + 1; i++) {
		if(i != entry)
		    System.out.print(i + " ");
		else
		    System.out.println(i);
	    }
	    entry = in.nextInt();
	}
    }
}
