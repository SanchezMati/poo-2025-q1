package Parcial2.p2_23_02.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ScoreBoard<E extends Comparable<? super E>> extends TreeSet<PlayerScore<E>> {

	public List<PlayerScore<E>> getTopScores(int n) {
		List<PlayerScore<E>> toReturn = new ArrayList<>();
		Iterator<PlayerScore<E>> it = iterator();
		while(n > 0 && it.hasNext()) {
			toReturn.add(it.next());
			n--;
		}
		return toReturn;
	}
}
