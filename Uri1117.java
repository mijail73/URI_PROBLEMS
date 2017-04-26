import java.util.Scanner;

public class Uri1117 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float note, media = 0, contador = 0;
	while(contador < 2) {
	    note = in.nextFloat();
	    if(note >= 0 && note <= 10) {
		media += note;
		contador ++;
	    } else
		System.out.println("nota invalida");
	}
	System.out.printf("media = %.2f\n", media / contador);
    }
}
