import java.util.Scanner;

public class Uri1120 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String failedDigit = input.next();
	String contract = input.next();
	Uri1120 reto = new Uri1120();
	while(!failedDigit.equals("0") && !contract.equals("0")) {
	    contract = reto.formato(contract, failedDigit);
	    contract = reto.quitarCerosIzq(contract);
	    System.out.println(contract);
	    failedDigit = input.next();
	    contract = input.next();
	}
    }

    public String formato(String entrada, String digito) {
	if(entrada.replace(digito,"").equals(""))
	    entrada = "0";
	else if(entrada.replace(digito,"").matches("0+")) {
	    entrada = "0";
	} else {
	    entrada = entrada.replace(digito, "");
	}
	return entrada;
    }

    public String quitarCerosIzq(String entrada) {
	char[] cadena = entrada.toCharArray();
	int indice = 0;
	for (int i = 0; i < cadena.length ; i++) {
	    if(!(cadena[i] == '0')) {
		indice = i;
		break;
	    }
	}
	entrada = entrada.substring(indice);
	return entrada;
    } 
}
