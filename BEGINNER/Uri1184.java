import java.io.IOException;
import java.util.Scanner;

public class Uri1184 {
    
    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Uri1184 test = new Uri1184();
	String input = in.nextLine();
	float number;
	float matrix[][] = new float[12][12];
	for (int i = 0; i < 12; i++) {
	    for (int j = 0; j < 12; j++) {
		number = in.nextFloat();
		matrix[i][j] = number;
	    }
	}
	if(input.equals("S")){
	    System.out.printf("%.1f\n", test.suma(matrix));
	} else {
	    System.out.printf("%.1f\n", test.promedio(matrix));
	}
    }
    
    public float suma(float matrix[][]){
	int limite = 1;
	float suma = 0;
	for (int i = 1; i < 12; i++) {
	    for (int j = 0; j < limite; j++)
		suma += matrix[i][j];
	    limite += 1;
	}
	return suma;
    }
    
    public float promedio(float matrix[][]){
	int limite = 1;
	float promedio = 0;
	for (int i = 1; i < 12; i++) {
	    for (int j = 0; j < limite; j++)
		promedio += matrix[i][j];
	    limite += 1;
	}
	promedio = promedio / 66;
	return promedio;
    }
    
}
