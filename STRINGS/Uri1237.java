import java.util.Scanner;

public class Uri1237 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Uri1237 reto = new Uri1237();
	while(input.hasNextLine()) {
	    String cadenaA = input.nextLine();
	    String cadenaB = input.nextLine();
	    System.out.println(reto.numeroSubCadenas(cadenaA, cadenaB));
	}
    }

    public int numeroSubCadenas(String a, String b) {
	int max = 0;
	for (int i = 0; i < a.length(); i++) {
	    for (int j = 0; j < b.length(); j++) {
		if(a.charAt(i) == b.charAt(j)) {
		    int c = 0;
		    for (int m = 0; m + i < a.length() && m + j < b.length(); m ++) {
		    	if(a.charAt(m + i) != b.charAt(m + j))
		    	    break;
		    	c ++;
		    }
		    if(c > max)
		    	max = c;
		}
	    }
	}
	return max;
    }
}
