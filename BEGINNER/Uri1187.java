import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

public class Uri1187 {
    
    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Uri1187 test = new Uri1187();
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
	    System.out.printf("%.1f\n", test.promedio(matrix));
	}
    }
    
    public Double suma(Double matrix[][]){
	int limiteIzq = 1;
	int limiteDer = 11;
	Double suma = 0.0;
	for (int i = 0; i < 5; i++) {
	    for (int j = limiteIzq; j < limiteDer; j++)
		suma += matrix[i][j];
	    limiteIzq += 1;
	    limiteDer -= 1;
	}
	return suma;
    }
    
    public Double promedio(Double matrix[][]){
	int limiteIzq = 1;
	int limiteDer = 11;
	Double promedio = 0.0;
	for (int i = 0; i < 5; i++) {
	    for (int j = limiteIzq; j < limiteDer; j++)
		promedio += matrix[i][j];
	    limiteIzq += 1;
	    limiteDer -= 1;
	}
	promedio = promedio / 30;
	return promedio;
    }
    
}
