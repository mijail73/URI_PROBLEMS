import java.util.Scanner;
import java.io.IOException;

public class Uri1012 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	String numbers = in.nextLine();
	String[] inumbers = numbers.split(" ");
	Double A = Double.parseDouble(inumbers[0]);
	Double B = Double.parseDouble(inumbers[1]);
	Double C = Double.parseDouble(inumbers[2]);
	Double trian = A * C / 2;
	System.out.printf("TRIANGULO: %.3f\n", trian);
	Double circ = 3.14159 * Math.pow(C,2);
	System.out.printf("CIRCULO: %.3f\n", circ);
	Double trap = C * ((A + B) / 2);
	System.out.printf("TRAPEZIO: %.3f\n", trap);
	Double quad = B * B;
	System.out.printf("QUADRADO: %.3f\n", quad);
	Double recta = A * B;
	System.out.printf("RETANGULO: %.3f\n", recta);
    }
}
