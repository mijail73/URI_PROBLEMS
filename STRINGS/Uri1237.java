import java.util.Scanner;
import java.util.LinkedList;

public class Uri1237 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String cadenaA = input.nextLine();
	String cadenaB = input.nextLine();
	Uri1237 reto = new Uri1237();
	while(true) {
	    LinkedList<String> cadA = reto.subcadenas(cadenaA);
	    LinkedList<String> cadB = reto.subcadenas(cadenaB);
	    LinkedList<String> interseccion = reto.juntarListas(cadA, cadB);
	    if(interseccion.size() > 0)
		System.out.println(reto.obtieneMayor(interseccion));
	    else
		System.out.println(0);
	    cadenaA = input.nextLine();
	    if(cadenaA.equals(""))
		break;
	    cadenaB = input.nextLine();
	}
    }

    public LinkedList<String> subcadenas(String cadena) {
	LinkedList<String> substrings = new LinkedList<>();
	String cadenaMod;
	for (int i = 0; i < cadena.length(); i++) {
	    for (int j = i + 1; j <= cadena.length(); j++) {
		cadenaMod = cadena.substring(i, j);
		substrings.add(cadenaMod);
	    }
	}
	return substrings;
    }

    public LinkedList<String> juntarListas(LinkedList<String> a,
					   LinkedList<String> b) {
	LinkedList<String> nueva = new LinkedList<>();
	for(String x : a) {
	    if(b.contains(x))
		nueva.add(x);
	}
	return nueva;
    }

    public int obtieneMayor(LinkedList<String> a) {
	int mayor = a.getFirst().length();
	for(String x : a) {
	    if(x.length() > mayor)
		mayor = x.length();
	}
	return mayor;
    }
}
