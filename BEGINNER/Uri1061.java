import java.util.Scanner;
import java.util.regex.Pattern;

public class Uri1061 {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int dia = Integer.parseInt(in.findInLine("\\d+"));
	in.nextLine();
	String start = in.nextLine();
	int diafin = Integer.parseInt(in.findInLine("\\d+"));
	in.nextLine();
	String end = in.nextLine();
	String[] stime = start.split(" : ");
	String[] etime = end.split(" : ");
	int hour = Integer.parseInt(stime[0]);
	int min = Integer.parseInt(stime[1]);
	int sec = Integer.parseInt(stime[2]);
	int hourf = Integer.parseInt(etime[0]);
	int minf = Integer.parseInt(etime[1]);
	int secf = Integer.parseInt(etime[2]);
	int dias;
	if (diafin == dia)
	    dias = 0;
	else if(hourf > hour)
	    dias = diafin - dia;
	else
	    dias = diafin - dia -1;
	int horas = 0, minutos = 0, segundos;

	if(secf > sec)
	    segundos = secf - sec;
	else {
	    segundos = secf - sec + 60;
	    minutos --;
	    if(segundos == 60) {
		segundos = 0;
		minutos ++;
	    }
	}
	
	if(minf > min)
	    minutos += minf - min;
	else {
	    minutos += minf - min + 60;
	    horas --;
	    if(minutos == 60) {
		minutos = 0;
		horas ++;
	    }
	}

	if( hourf > hour)
	    horas += hourf - hour;
	else {
	    horas += hourf - hour + 24;
	    if(horas == 24) {
		horas = 0;
		dias ++;
	    }
	}
	
	System.out.println(dias + " dia(s)");
	System.out.println(horas + " hora(s)");
	System.out.println(minutos + " minuto(s)");
	System.out.println(segundos + " segundo(s)");
    }
}
