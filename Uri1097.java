public class Uri1097 {

    public static void main(String[] args) {
	int iprima = 1, jprima = 7, ciclos = 9 / 2;
	for (int i = 0; i < ciclos + 1; i++) {
	    int jbiprima = jprima;
	    for (int j = 0; j < 3; j ++) {
		System.out.println("I=" + iprima + " J=" + jbiprima);
		jbiprima --;
	    }
	    iprima += 2;
	    jprima += 2;
	}
    }
}
