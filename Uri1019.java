import java.util.Scanner;
import java.io.IOException;

public class Uri1019 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int hours = n / 3600;
	n = n % 3600;
	int minutes = n / 60;
	int seconds = n % 60;
	System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
