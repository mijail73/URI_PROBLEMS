import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri1009 {
    
    public static void main(String[] args) throws IOException {
	BufferedReader in =
	    new BufferedReader(new InputStreamReader(System.in));
	String name;
	double fixedSalary, totalSales, totalSalary;
	float resultado;
	name = in.readLine();
	fixedSalary = Double.parseDouble(in.readLine());
        totalSales = Double.parseDouble(in.readLine());
	totalSalary = totalSales * .15 + fixedSalary;
	System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
    }
}
