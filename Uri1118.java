import java.util.Scanner;

public class Uri1118 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float note, media = 0, contador = 0;
	int yn; // yes or no
	while(true) {
	    note = in.nextFloat();
	    if(note >= 0 && note <= 10) {
		media += note;
		contador ++;
	    } else
		System.out.println("nota invalida");
	    if(contador == 2) {
		System.out.printf("media = %.2f\n", media / contador);
		System.out.println("novo calculo (1-sim 2-nao)");
		yn = in.nextInt();
		while(yn != 1 && yn != 2) {
		    System.out.println("novo calculo (1-sim 2-nao)");
		    yn = in.nextInt();
		}
		if(yn == 1) {
		    contador = 0;
		    media = 0;
		}
		else
		    break;
	    }
	}
    }
}
