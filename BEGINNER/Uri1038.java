import java.util.Scanner;
import java.io.IOException;

public class Uri1038 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int code = in.nextInt();
	int quantity = in.nextInt();
	Double[] price = {0.0, 4.00, 4.50, 5.00, 2.00, 1.50};
	Double total = price[code] * quantity;
	System.out.printf("Total: R$ %.2f\n", total);
    }
}
