import java.util.Scanner;

public class Uri1072 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	int inp = 0, out = 0;
	for (int i = 0; i < cases; i++) {
	    int caseN = in.nextInt();
	    if(caseN >= 10 && caseN <= 20)
		inp ++;
	    else
		out ++;
	}
	System.out.println(inp + " in");
	System.out.println(out + " out");
    }
}
