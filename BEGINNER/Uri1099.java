import java.util.Scanner;

public class Uri1099 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int casos = in.nextInt();
	int a, b;
	int resultado = 0;
	for (int i = 0; i < casos; i++) {
	    a = in.nextInt();
	    b = in.nextInt();
	    if(a > b) {
		for (int j = b + 1; j < a ; j++) {
		    if(j % 2 != 0) 
			resultado += j;
		}
	    } else {
		for (int j = a + 1; j < b ; j++) {
		    if(j % 2 != 0)
			resultado += j;
		}
	    }
	    System.out.println(resultado);
	    resultado = 0;
	    // CON ESTE CODIGO(COMENTADO) LE GANE A HUGO, EL CODIGO DE ARRIBA
	    // ES LA VERSION PULIDA DEL CODIGO(la cual puli en casa)
	//     if(a > b) {
	// 	int[] arr = new int[a - b];
	// 	for (int x = 0; x < arr.length; x ++) {
	// 	    arr[x] = a;
	// 	    a --;
	// 	}
	// 	for (int x = 1; x < arr.length; x++) {
	// 	    if(arr[x] % 2 != 0)
	// 		resultado += arr[x];
	// 	}
	//     } else if(a == b) {
	// 	resultado = 0;
	//     } else {
	// 	int[] arr = new int[b - a];
	// 	for (int x = 0; x < arr.length; x++) {
	// 	    arr[x] = b;
	// 	    b --;
	// 	}
	// 	for (int x = 1; x < arr.length; x++) {
	// 	    if(arr[x] % 2 != 0)
	// 		resultado += arr[x];
	// 	}
	//     }
	//     System.out.println(resultado);
	//     resultado = 0;
	}
    }
}
