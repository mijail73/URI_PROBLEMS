import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1025 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	int casos = 1;
	int[] N, Q;
	int numero;
	String entradaI;
	int a = 0;
	int b = 0;
	int variable = 0;
	entradaI = in.readLine();
	if(entradaI.contains(" ")) {
	    String[] entrada = entradaI.split(" ");
	    int[] entradaint = new int[entrada.length];
	    for (int i = 0; i < entrada.length; i++) {
		entradaint[i] = Integer.parseInt(entrada[i]);
	    }
	    a = entradaint[0];
	    b = entradaint[1];
	}
	while(a != 0 && b != 0) {
	    if(a > -1 && a < 10001 && b < 10001 && b > -1) {
		System.out.format("CASE# %d:\n", casos);
		N = new int[a];
		Q = new int[b];
		for (int i = 0; i < N.length; i++) {
		    numero = Integer.parseInt(in.readLine());
		    N[i] = numero;
		}
		for (int i = 0; i < Q.length; i++) {
		    numero = Integer.parseInt(in.readLine());
		    Q[i] = numero;
		}
		Arrays.sort(N);
		for(int i = 0; i < Q.length; i ++) {
		    for (int j = 0; j < N.length; j++) {
			if(Q[i] == N[j]) {
			    variable = j;
			    break;
			} else {
			    variable = -1;
			}
		    }
		    if(variable == -1)
			System.out.print(Q[i] + " not found" + "\n");
		    else
			System.out.print(Q[i] + " found at " + (variable + 1) + "\n");
		}
		casos ++;
	    }
	    String entrada2;
	    entrada2 = in.readLine();
	    if(entrada2.contains(" ")) {
		//String entradaloop;
		//entradaloop = in.readLine();
		String[] entradaloopArr = entrada2.split(" ");
		int[] entradaloopint = new int[entradaloopArr.length];
		for (int i = 0; i < entradaloopint.length; i++) {
		    entradaloopint[i] = Integer.parseInt(entradaloopArr[i]);
		}
		a = entradaloopint[0];
		b = entradaloopint[1];
	    }
	}
    }
}
