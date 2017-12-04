import java.util.Scanner;
import java.util.LinkedList;

public class Uri1089 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	LinkedList<Integer> secuencia = new LinkedList<>();
	int input = in.nextInt();
	int peaks = 0;
	int apuntador = 0;
	while(input != 0) {
	    for (int i = 0; i < input; i++) {
		secuencia.add(in.nextInt());
	    }
	    //H1 follows Hn
	    secuencia.add(secuencia.getFirst());

	    //Recorremos la lista
	    while(apuntador < secuencia.size() -1) {
		//Si el siguiente es menor
		if(secuencia.get(apuntador) > secuencia.get(apuntador + 1)) {
		    while(apuntador < secuencia.size() - 1 &&
			  secuencia.get(apuntador) > secuencia.get(apuntador + 1)) {
			apuntador ++;
		    }
		    peaks ++;
		} else { //Si el siguiente es mayor
		    while(apuntador < secuencia.size() -1 &&
			  secuencia.get(apuntador) < secuencia.get(apuntador + 1)) {
			apuntador ++;
		    }
		    peaks ++;
		}
	    }

	    //Si el peak del final va en misma direccion que el peak del inicio
	    // restar uno a peaks;
	    if(secuencia.get(0) > secuencia.get(1) &&
	       secuencia.getLast() < secuencia.get(secuencia.size() - 2) ||
	       secuencia.get(0) < secuencia.get(1) &&
	       secuencia.getLast() > secuencia.get(secuencia.size() -2))
		peaks --;
	    System.out.println(peaks);
	    input = in.nextInt();
	    peaks = 0;
	    apuntador = 0;
	    secuencia.clear();
	}
    }
}
