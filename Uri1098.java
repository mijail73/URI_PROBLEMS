public class Uri1098 {

    public static void main(String[] args) {
	for (int i = 0; i < 11; i++) {
	    for (int j = 1; j < 4; j ++) {
		if(i == 0 || i == 5 || i == 10)
		    System.out.printf("I=%.0f J=%.0f\n", i * .2, j + (i * .2));
		else
		    System.out.printf("I=%.1f J=%.1f\n", i * .2, j + (i * .2));
	    }
	}
    }
}
