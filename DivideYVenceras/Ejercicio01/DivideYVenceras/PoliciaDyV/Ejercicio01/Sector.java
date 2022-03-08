package  DivideYVenceras.PoliciaDyV.Ejercicio01;
public class Sector {
	private int i;
	private int j;
	private int score;
	
	public Sector() {
		i = -1;
		j = -1;
		score = -1;
	}
	
	public Sector(int i, int j, int score) {
		this.i = i;
		this.j = j;
		this.score = score;
	}
	

	public int getScore() {
		return this.score;
	}
	
	public int getI() {
		return this.i;
	}
	
	public int getJ() {
		return this.j;
	}
	
 @Override
	public String toString() {
		String out = new String();
		return out += "x: " + this.getI() + " j: " + this.getJ() + " score: " + this.getScore();
	
	}
	
	public int compareTo(Sector o) {
		if (this.getScore() > o.getScore()) {
			return 1;
		} else if (this.getScore() < o.getScore()) {
			return -1;
		} else {
			return 0;
		}
	}
}
