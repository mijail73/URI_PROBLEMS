import java.util.Scanner;

public class Uri1182 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	float[][] matriz = new float[12][12];
	int columnToOperate = in.nextInt();
	float result = 0;
	char operation = in.next().charAt(0);
	for (int row = 0; row < 12; row ++) {
	    for (int column = 0; column < 12; column ++) {
		matriz[row][column] = in.nextFloat();
	    }
	}

	if(operation == 'S') {
	    for (int row = 0; row < 12; row++) {
		result += matriz[row][columnToOperate];
	    }
	    System.out.format("%.1f%n", result);
	} else {
	    for (int row = 0; row < 12; row++) {
		result += matriz[row][columnToOperate];
	    }
	    result /= 12;
	    System.out.format("%.1f%n", result);
	}
    }
}
