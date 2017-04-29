import java.util.Scanner;

public class Uri1050 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int entry = in.nextInt();
	if(entry == 61)
	    System.out.println("Brasilia");
	else if(entry == 71)
	    System.out.println("Salvador");
	else if(entry == 11)
	    System.out.println("Sao Paulo");
	else if(entry == 21)
	    System.out.println("Rio de Janeiro");
	else if(entry == 32)
	    System.out.println("Juiz de Fora");
	else if(entry == 19)
	    System.out.println("Campinas");
	else if(entry == 27)
	    System.out.println("Vitoria");
	else if(entry == 31)
	    System.out.println("Belo Horizonte");
	else
	    System.out.println("DDD nao cadastrado");
    }
}
