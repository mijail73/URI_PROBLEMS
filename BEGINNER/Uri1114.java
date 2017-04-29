import java.util.Scanner;

public class Uri1114 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	while(a != 2002) {
	    System.out.println("Senha Invalida");
	    a = in.nextInt();
	}
	System.out.println("Acesso Permitido");
    }
}
