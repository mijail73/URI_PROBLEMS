import java.util.Scanner;
//Version Mejorada 
public class Uri2591 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	String cadena = "";
	StringBuilder sb = new StringBuilder();
	int aprim = 0;
	int asegun = 0;
	int multi = 0;
	while(cases > 0) {
	    sb.append("k");
	    cadena = in.next();
	    String[] cadenaArr = cadena.split("k");
	    aprim = cadenaArr[0].length() - cadenaArr[0].replace("a", "").length();
	    asegun = cadenaArr[1].length() - cadenaArr[1].replace("a", "").length();
	    multi = aprim * asegun;
	    for (int i = 0; i < multi; i++)
		sb.append("a");
	    System.out.println(sb);
	    aprim = asegun = multi = 0;
	    sb = new StringBuilder();
	    cases --;
	}
    }
}
