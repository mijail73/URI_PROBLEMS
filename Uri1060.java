import java.util.Scanner;

public class Uri1060 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float entry;
	int posi = 0;
	for (int i = 0; i < 6; i++) {
	    entry = in.nextFloat();
	    if(entry > -1)
		posi ++;
	}
	System.out.println(posi + " valores positivos");
    }
}
