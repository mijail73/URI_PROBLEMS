import java.util.Scanner;

public class Uri1134 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = 0, alcool = 0, gasolina = 0, diesel = 0;
	while(entry != 4) {
	    entry = in.nextInt();
	    switch(entry) {
	    case 1: alcool += 1;
		break;
	    case 2: gasolina += 1;
		break;
	    case 3: diesel += 1;
		break;
	    default: break;
	    }
	}
	System.out.println("MUITO OBRIGADO");
	System.out.println("Alcool: " + alcool);
	System.out.println("Gasolina: " + gasolina);
	System.out.println("Diesel: " + diesel);
    }
}
