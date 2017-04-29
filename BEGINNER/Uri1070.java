import java.util.Scanner;

public class Uri1070 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	for (int j = entry; j < entry + 12; j++) {
	    if(j % 2 != 0)
		System.out.println(j);		
	}
    }
}
