import java.util.Scanner;

public class Uri1150 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	int z = in.nextInt();
	int suma = 0, enteros = 0;
	while(z <= x)
	    z = in.nextInt();
	while(true) {
	    suma += x;
	    x ++;
	    enteros ++;
	    if(suma > z)
		break;
	}
	System.out.println(enteros);
    }
}
