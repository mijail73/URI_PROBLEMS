import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

public class Uri1190 {
    
    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Uri1190 test = new Uri1190();
	String input = in.nextLine();
	Double number;
	Double matrix[][] = new Double[12][12];
	for (int i = 0; i < 12; i++) {
	    for (int j = 0; j < 12; j++) {
		number = in.nextDouble();
		matrix[i][j] = number;
	    }
	}
	if(input.equals("S")){
	    System.out.printf("%.1f\n", test.suma(matrix));
	} else {
	    System.out.printf("%.1f\n", test.suma(matrix) / 30);
	}
    }
    
    public Double suma(Double matrix[][]){
	int limiteArriba = 1;
	int limiteAbajo = 11;
	Double suma = 0.0;
	for (int j = 11; j > 6; j--) {
	    for (int i = limiteArriba; i < limiteAbajo; i++)
		suma += matrix[i][j];
	    limiteArriba += 1;
	    limiteAbajo -= 1;
	}
	return suma;
    }
        
}
