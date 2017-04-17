import java.util.Scanner;
import java.io.IOException;

public class Uri1040 {

    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
	float uno = in.nextFloat();
	float dos = in.nextFloat();
	float tres = in.nextFloat();
	float cuatro = in.nextFloat();
	float media = (uno * 2 + dos * 3 + tres * 4 + cuatro * 1) / 10;
	System.out.printf("Media: %.1f\n", media);
	if(media >= 7.0)
	    System.out.println("Aluno aprovado.");
	else if(media < 5.0)
	    System.out.println("Aluno reprovado.");
	else {
	    System.out.println("Aluno em exame.");
	    float examen = in.nextFloat();
	    System.out.println("Nota do exame: " + examen);
	    media = (media + examen) / 2;
	    if(media >= 5.0)
		System.out.println("Aluno aprovado.");
	    else
		System.out.println("Aluno reprovado.");
	    System.out.printf("Media final: %.1f\n", media);
	}
    }
}
