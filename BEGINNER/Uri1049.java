import java.util.Scanner;

public class Uri1049 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String a = in.next();
	String b = in.next();
	String c = in.next();
	if(a.equals("vertebrado")) {
	    if(b.equals("ave")){
		if(c.equals("carnivoro"))
		    System.out.println("aguia");
		else
		    System.out.println("pomba");
	    } else {
		if(c.equals("onivoro"))
		    System.out.println("homem");
		else
		    System.out.println("vaca");
	    }
	} else {
	    if(b.equals("inseto")){
		if(c.equals("hematofago"))
		    System.out.println("pulga");
		else
		    System.out.println("lagarta");
	    } else {
		if(c.equals("hematofago"))
		    System.out.println("sanguessuga");
		else
		    System.out.println("minhoca");
	    }
	}
    }
}
