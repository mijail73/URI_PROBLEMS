import java.util.Scanner;

public class Uri1052 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int number = in.nextInt();
	String[] months = {"January", "February", "March", "April", "May", "June",
			   "July", "August", "September", "October", "November",
			   "December"};
	System.out.println(months[number -1]);
    }
}
