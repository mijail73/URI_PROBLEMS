import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problema de Uri1110
 * @author mijail
 */

public class Uri1110 {
    
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	String entrada = in.readLine();
	int entradaX = Integer.parseInt(entrada);
	while(entradaX != 0) {
	    LinkedList<Integer> input = new LinkedList<>();
	    LinkedList<Integer> salida = new LinkedList<>();
	    for (int i = 1; i < entradaX + 1; i++) {
		input.add(i);
	    }
	    while(input.size() > 1) {
		int cabeza = input.removeFirst();
		salida.add(cabeza);
		int cabezaFinal = input.removeFirst();
		input.add(cabezaFinal);
	    }
	    int finalX = input.getLast();
	    //	    salida.forEach(System.out::printl(" ,"));
	    //	    salida.toString();
	    //	    String lista = System.out.print(salida);
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < salida.size(); i++) {
		//		sb.append(salida.get(i) + ", ");
		if(i == salida.size() - 1)
		    sb.append(salida.get(i));
		else
		    sb.append(salida.get(i) + ", ");
	    }
	    System.out.println("Discarded cards: " + sb);
	    System.out.format("Remaining card: %d\n", finalX);
	    entrada = in.readLine();
	    entradaX = Integer.parseInt(entrada);
	}
    }
}
