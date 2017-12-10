import java.util.Scanner;

public class Uri1198 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String cadena;
	while(input.hasNextLine()) {
	    cadena = input.nextLine();
	    String[] numeros = cadena.split(" ");
	    if(numeros.length == 2) {
		System.out.println(Math.abs(Long.parseLong(numeros[0]) - Long.parseLong(numeros[1])));
	    } else
		break;
	}
    }
}
