import java.util.Scanner;

public class Uri1131 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a, b, inter = 0, gremio = 0, empates = 0, grenais = 1, option = 0;
	while(true) {
	    a = in.nextInt();
	    b = in.nextInt();
	    if(a > b)
		inter ++;
	    else if(a < b)
		gremio ++;
	    else
		empates ++;
	    System.out.println("Novo grenal (1-sim 2-nao)");
	    option = in.nextInt();
	    if(option == 1)
		grenais ++;
	    else
		break;
	}
	System.out.println(grenais + " grenais");
	System.out.println("Inter:" + inter);
	System.out.println("Gremio:" + gremio);
	System.out.println("Empates:" + empates);
	if(inter > gremio)
	    System.out.println("Inter venceu mais");
	else if(gremio < inter)
	    System.out.println("Gremio venceu mais");
	else
	    System.out.println("Não houve vencedor");
    }
}
