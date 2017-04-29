import java.util.Scanner;

public class Uri1075 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	for(int i = 1; i < 10001; i ++) {
	    if(i % n == 2)
		System.out.println(i);
	}
    }
}
