import java.util.Scanner;
import java.io.IOException;

public class Uri1021 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	String num = in.nextLine();
	String[] x = num.split("\\.");
	int nota = Integer.parseInt(x[0]);
	int moeda = Integer.parseInt(x[1]);
	int res;
	System.out.println("NOTAS:");
	res = nota / 100;
	nota = nota % 100;
	System.out.println(res + (" nota(s) de R$ 100.00"));
	res = nota / 50;
	nota = nota % 50;
	System.out.println(res + (" nota(s) de R$ 50.00"));
	res = nota / 20;
	nota = nota % 20;
	System.out.println(res + (" nota(s) de R$ 20.00"));
	res = nota / 10;
	nota = nota % 10;
	System.out.println(res + (" nota(s) de R$ 10.00"));
	res = nota / 5;
	nota = nota % 5;
	System.out.println(res + (" nota(s) de R$ 5.00"));
	res = nota / 2;
	nota = nota % 2;
	System.out.println(res + (" nota(s) de R$ 2.00"));
	res = nota / 1;
	nota = nota % 1;
	System.out.println("MOEDAS:");
	System.out.println(res + (" moeda(s) de R$ 1.00"));
	res = moeda / 50;
	moeda = moeda % 50;
	System.out.println(res + (" moeda(s) de R$ 0.50"));
	res = moeda / 25;
	moeda = moeda % 25;
	System.out.println(res + (" moeda(s) de R$ 0.25"));
	res = moeda / 10;
	moeda = moeda % 10;
	System.out.println(res + (" moeda(s) de R$ 0.10"));
	res = moeda / 5;
	moeda = moeda % 5;
	System.out.println(res + (" moeda(s) de R$ 0.05"));
	res = moeda / 1;
	moeda = moeda % 1;
	System.out.println(res + (" moeda(s) de R$ 0.01"));
    }
}
