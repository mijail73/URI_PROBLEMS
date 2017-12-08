import java.util.Scanner;
//Respuesta usando POO, recuerda cambiar todas las ocurrencias de
//Uri1024 a Main, al poner en el compilador de Uri
public class Uri1024 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int cases = input.nextInt();
	input.nextLine();
	String entrada = "";
	Uri1024 reto = new Uri1024();
	while(cases > 0) {
	    entrada = input.nextLine();
	    char[] movidos = reto.mover3(entrada);
	    String volteada = reto.volteada(movidos);
	    volteada = reto.cambiaMitad(volteada);
	    System.out.println(volteada);
	    cases --;
	}
    }

    public char[] mover3(String entrada) {
	int valor = 0;
	char[] arreglo = entrada.toCharArray();
	for (int i = 0; i < arreglo.length; i++) {
	    valor = arreglo[i];
	    if(valor == 32 || !Character.isLetter(arreglo[i]))
		arreglo[i] = arreglo[i];
	    else
		arreglo[i] = (char) (valor + 3);
	}
	return arreglo;
    }

    public String volteada(char[] entrada) {
	String resultado = new String(entrada);
	resultado = new StringBuilder(resultado).reverse().toString();
	return resultado;
    }

    public String cambiaMitad(String entrada) {
	int mitad = entrada.length() / 2 ;
	int valor = 0;
	String resultado;
	char[] entradaArray = entrada.toCharArray();
	for (int i = mitad; i < entradaArray.length; i++) {
	    valor = entradaArray[i] - 1;
	    entradaArray[i] = (char) (valor);
	}
	return resultado = new String(entradaArray);
    }
}
