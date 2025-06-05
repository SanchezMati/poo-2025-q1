package Parcial2.p2_23_02.ejercicio2;

public class PlayerScore<S extends Comparable<? super S>> implements Comparable<PlayerScore<S>> {
    private final String player;
    private final S score;
	

    public PlayerScore(String player, S score) {
        this.player = player;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player %s scored %s".formatted(player, score);
    }
    
    @Override
    public int compareTo(PlayerScore o) {
		int cmp = o.score.compareTo(score);
		if (cmp == 0) {
			cmp = player.compareTo(o.player);
		}
		return cmp;
    }
}

