import java.util.Scanner;

public class Uri1181 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float[][] matriz = new float[12][12];
	int rowToOperate = in.nextInt();
	float result = 0;
	char operation = in.next().charAt(0);
	for (int row = 0; row < 12; row ++) {
	    for (int column = 0; column < 12; column ++) {
		matriz[row][column] = in.nextFloat();
	    }
	}

	if(operation == 'S') {
	    for (int column = 0; column < 12; column++) {
		result += matriz[rowToOperate][column];
	    }
	    System.out.format("%.1f%n", result);
	} else {
	    for (int column = 0; column < 12; column++) {
		result += matriz[rowToOperate][column];
	    }
	    result /= 12;
	    System.out.format("%.1f%n", result);
	}
    }
}
