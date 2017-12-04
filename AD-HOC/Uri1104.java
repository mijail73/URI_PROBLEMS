import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Uri1104 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Set<Integer> cardsAlice = new HashSet<>();
	Set<Integer> cardsBetty = new HashSet<>();
	int aliceN = in.nextInt();
	int bettyN = in.nextInt();
	while(aliceN != 0 && bettyN != 0) {
	    for (int i = 0; i < aliceN; i++) {
		cardsAlice.add(in.nextInt());
	    }
	    for (int i = 0; i < bettyN; i++) {
		cardsBetty.add(in.nextInt());
	    }
	    Iterator<Integer> iteradorAlice = cardsAlice.iterator();
	    Iterator<Integer> iteradorBetty = cardsBetty.iterator();
	    if(cardsAlice.size() < cardsBetty.size()) {
		while(iteradorAlice.hasNext()) {
		    Integer x = iteradorAlice.next();
		    if(cardsBetty.contains(x))
			iteradorAlice.remove();
		}
		System.out.println(cardsAlice.size());		
	    } else {
		while(iteradorBetty.hasNext()) {
		    Integer x = iteradorBetty.next();
		    if(cardsAlice.contains(x))
			iteradorBetty.remove();
		}
		System.out.println(cardsBetty.size());
	    }

	    aliceN = in.nextInt();
	    bettyN = in.nextInt();
	    cardsAlice.clear();
	    cardsBetty.clear();
	}
    }
}
