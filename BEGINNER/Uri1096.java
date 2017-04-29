public class Uri1096 {

    public static void main(String[] args) {
	int iprima = 1, ciclos = 9 / 2;
	for (int i = 0; i < ciclos + 1; i++) {
	    for (int j = 7; j > 4; j--) {
		System.out.println("I=" + iprima + " J=" + j);
	    }
	    iprima += 2;
	}
    }
}
