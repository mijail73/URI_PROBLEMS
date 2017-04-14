import java.util.Scanner;
import java.io.IOException;

public class Uri1015 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	Double x1 = in.nextDouble();
	Double y1 = in.nextDouble();
	Double x2 = in.nextDouble();
	Double y2 = in.nextDouble();
	Uri1015 test = new Uri1015();
	Double res = test.distance(x1, y1, x2, y2);
	System.out.printf("%.4f\n", res);
    }

    public Double distance(Double x1, Double y1, Double x2, Double y2) {
	Double dist = Math.sqrt(Math.pow((x2 - x1), 2) +
				Math.pow((y2 - y1), 2));
	return dist;
    }
}
