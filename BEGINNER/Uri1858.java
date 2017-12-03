import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class Uri1858 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int numbers = in.nextInt();
	LinkedList<Integer> list = new LinkedList<>();
	for (int i = 0; i < numbers; i++) {
	    list.add(in.nextInt());	    
	}
	System.out.println(list.indexOf(Collections.min(list)) + 1);
    }
}
