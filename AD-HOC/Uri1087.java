import java.util.Scanner;

public class Uri1087 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
	boolean oneMovment = false;
	int tmp1 = 0;
	while(true) {
	    x1 = in.nextInt();
	    y1 = in.nextInt();
	    x2 = in.nextInt();
	    y2 = in.nextInt();
	    if(x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0)
		break;

	    //Cuadrantes segun Plano Cartesiano,el centro es la pieza x1, y1
	    //Diagonal cuadrante 2
	    tmp1 = y1 - 1;
	    for (int row = x1 - 1; row > 0; row--) {
		if(row == x2 && tmp1 == y2) {
		    oneMovment = true;
		}
		tmp1 --;
	    }
	    //Diagonal cuadrante 4
	    tmp1 = y1 + 1;
	    for (int row = x1 + 1; row < 9; row++) {
		if(row == x2 && tmp1 == y2)
		    oneMovment = true;
		tmp1 ++;
	    }
	    //Diagonal cuadrante 3
	    tmp1 = y1 - 1;
	    for (int row = x1 + 1; row < 9; row++) {
		if(row == x2 && tmp1 == y2)
		    oneMovment = true;
		tmp1 --;
	    }
	    //Diagonal cuadrante 1
	    tmp1 = y1 + 1;
	    for (int row = x1 - 1; row > 0; row--) {
		if(row == x2 && tmp1 == y2)
		    oneMovment = true;
		tmp1 ++;
	    }

	    //Misma posicion
	    if(x1 == x2 && y1 == y2)
		System.out.println(0);
	    else if(x1 == x2 || y1 == y2 || oneMovment)//vertical, horizontal o diagonales
		System.out.println(1);
	    else//ninguna de las anteriores, ergo. dos movimientos
		System.out.println(2);
	    oneMovment = false;
	}
     }
}
