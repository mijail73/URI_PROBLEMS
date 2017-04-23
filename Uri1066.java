import java.util.Scanner;

public class Uri1066 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entrada, par = 0, impar = 0, positivo = 0, negativo = 0;
	for (int i = 0; i < 5; i++) {
	    entrada = in.nextInt();
	    if(entrada % 2 == 0)
		par ++;
	    else
		impar ++;
	    if(entrada > 0)
		positivo ++;
	    else if(entrada < 0)
		negativo ++;
	}
	System.out.println(par + " valor(es) par(es)");
	System.out.println(impar + " valor(es) impar(es)");
	System.out.println(positivo + " valor(es) positivo(s)");
	System.out.println(negativo + " valor(es) negativo(s)");
    }
}
