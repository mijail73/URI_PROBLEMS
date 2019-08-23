import java.util.Scanner;

public class Uri1222 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String shortStory = "";
	double totalPages = 0;
	int n = 0;
	int l = 0;
	int c = 0;
	int resultado = 0;
	while(input.hasNextLine()) {
	    if(input.hasNextInt()) {
		n = input.nextInt();
		l = input.nextInt();
		c = input.nextInt();
		shortStory = "";
		input.nextLine();
	    }
	    while(!input.hasNextInt() && input.hasNextLine())
		shortStory += input.nextLine();
	    int lines = 0;
	    if(shortStory.length() > c)
	    	lines ++;
	    for (int i = c - 1; i < shortStory.length(); i += c) {
		if(shortStory.length() - 1 <= i) {
		    lines ++;
		    break;
		} else if(shortStory.charAt(i) == ' ') {
		    lines ++;
		    i = i + 1;
		} else if(shortStory.charAt(i + 1) == ' ') {
		    lines ++;
		    i = i + 2;
		} else {
		    int j = i - 1;
		    while(shortStory.charAt(j) != ' ')
			j = j - 1;
		    lines ++;
		    i = j;
		}
	    }
	    int pages = lines / l;
	    if(lines % l != 0)
	    	pages ++;
	    System.out.println(pages);
	}
    }
}
