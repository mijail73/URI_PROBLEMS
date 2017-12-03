import java.util.Scanner;
import java.util.LinkedList;

public class Uri1179 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	LinkedList<Integer> impar = new LinkedList<>();
	LinkedList<Integer> par = new LinkedList<>();
	int contadorPar = 0, contadorImpar = 0;
	for (int i = 0; i < 15; i++) {
	    int entrada = input.nextInt();
	    if(entrada % 2 == 0) {
		par.add(entrada);
		contadorPar ++;
		if(contadorPar == 5) {
		    for (int r = 0; r < 5; r++) {
			System.out.println("par[" + r + "] = " + par.get(r));
		    }
		    par.clear();
		    contadorPar = 0;
		}
	    } else {
		impar.add(entrada);
		contadorImpar ++;
		if(contadorImpar == 5) {
		    for (int r = 0; r < 5; r++) {
			System.out.println("impar[" + r + "] = " + impar.get(r));
		    }
		    impar.clear();
		    contadorImpar = 0;
		}
	    }
	}
	if(impar.size() > 0) {
	    for (int w = 0; w < impar.size(); w++) {
		System.out.println("impar[" + w + "] = " + impar.get(w));
	    }
	}
	if(par.size() > 0) {
	    for (int w = 0; w < par.size(); w++) {
		System.out.println("par[" + w + "] = " + par.get(w));
	    }
	}
    }
}
