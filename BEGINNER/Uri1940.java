import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problema de Uri1110
 * @author mijail
 */

public class Uri1940 {
    
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	String entrada = in.readLine();
	String[] entradaX = entrada.split(" ");
	int[] entradaZ = new int[entradaX.length];
	for (int i = 0; i < entradaX.length; i++) {
	    entradaZ[i] = Integer.parseInt(entradaX[i]);
	}
	int players = entradaZ[0];
	int rounds = entradaZ[1];
	String entrada2 = in.readLine();
	String[] entradaX2 = entrada2.split(" ");
	int[] victoryPoints5 = new int[entradaX2.length];
	for (int i = 0; i < entradaX2.length; i++) {
	    victoryPoints5[i] = Integer.parseInt(entradaX2[i]);
	}
	//contador auxiliar
	int m = 0;
	int[] puntosPorJugador = new int[players];
	//Recorreremos el arreglo "players" veces
	for (int i = 0; i < players; i++) {
	    for (int j = m; j < victoryPoints5.length ; j += players) {
		puntosPorJugador[i] += victoryPoints5[j];
	    }
	    m ++;
	}
	int maximoFinal = -1;
	int ganador = -1;
	for (int i = 0; i < puntosPorJugador.length; i++) {
	    if(puntosPorJugador[i] >= maximoFinal) {
		maximoFinal = puntosPorJugador[i];
		ganador = i + 1;
	    }
	}
	System.out.println(ganador);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problema de Uri1110
 * @author mijail
 */

public class Uri1940 {
    
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	String entrada = in.readLine();
	String[] entradaX = entrada.split(" ");
	int[] entradaZ = new int[entradaX.length];
	for (int i = 0; i < entradaX.length; i++) {
	    entradaZ[i] = Integer.parseInt(entradaX[i]);
	}
	int players = entradaZ[0];
	int rounds = entradaZ[1];
	String entrada2 = in.readLine();
	String[] entradaX2 = entrada2.split(" ");
	int[] victoryPoints5 = new int[entradaX2.length];
	for (int i = 0; i < entradaX2.length; i++) {
	    victoryPoints5[i] = Integer.parseInt(entradaX2[i]);
	}
	//contador auxiliar
	int m = 0;
	int[] puntosPorJugador = new int[players];
	//Recorreremos el arreglo "players" veces
	for (int i = 0; i < players; i++) {
	    for (int j = m; j < victoryPoints5.length ; j += players) {
		puntosPorJugador[i] += victoryPoints5[j];
	    }
	    m ++;
	}
	int maximoFinal = -1;
	int ganador = -1;
	for (int i = 0; i < puntosPorJugador.length; i++) {
	    if(puntosPorJugador[i] >= maximoFinal) {
		maximoFinal = puntosPorJugador[i];
		ganador = i + 1;
	    }
	}
	System.out.println(ganador);
    }
}
