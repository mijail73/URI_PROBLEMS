import java.util.Scanner;
import java.io.IOException;

public class Uri1010 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Double valor = 0.0;
	int rondas = 0;
	while(true) {
	    String entradaI = in.nextLine();
	    String[] renglon = entradaI.split(" ");
	    valor += Double.parseDouble(renglon[1]) *
		Double.parseDouble(renglon[2]);
	    rondas ++;
	    if(rondas == 2)
		break;
	}
	System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}
