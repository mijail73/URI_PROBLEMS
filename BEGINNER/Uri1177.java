import java.util.Scanner;

public class Uri1177 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int t = input.nextInt();
	int[] n = new int[1000];
	int temp = 0;
	for (int i = 0; i < n.length; i++) {
	    System.out.println("N[" + i + "] = " + temp);
	    temp ++;
	    if(temp > t - 1)
		temp = 0;
	    n[i] = temp ;
	}
    }
}
