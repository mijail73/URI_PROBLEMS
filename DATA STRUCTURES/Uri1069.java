import java.util.Scanner;
import java.util.Stack;

public class Uri1069 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Stack<Character> diamantes = new Stack<>();
	int cases = in.nextInt();
	in.nextLine();
	String line;
	int numeroDiama = 0;
	while(cases > 0) {
	    line = in.nextLine();
	    char[] chars = line.toCharArray();
	    for (int i = 0; i <chars.length; i++) {
		if(chars[i] == '<')
		    diamantes.push(chars[i]);
		else if(chars[i] == '>' && ! diamantes.empty()
			&& diamantes.peek() == '<') {
		    numeroDiama ++;
		    diamantes.pop();
		}
	    }
	    System.out.println(numeroDiama);
	    numeroDiama = 0;
	    cases --;
	    diamantes = new Stack<>();
	}
    }
}
