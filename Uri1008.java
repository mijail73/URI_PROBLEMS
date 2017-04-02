import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1008 {
    
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	int number, workedHours;
	float receivedPerHour, salary;
	number = Integer.parseInt(in.readLine());
	workedHours = Integer.parseInt(in.readLine());
	receivedPerHour = Float.parseFloat(in.readLine());
	salary = workedHours * receivedPerHour;
	System.out.printf("NUMBER = %d\n", number);
	System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
