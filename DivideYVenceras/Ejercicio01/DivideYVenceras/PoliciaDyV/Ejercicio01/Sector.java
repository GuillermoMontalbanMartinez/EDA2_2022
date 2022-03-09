package  DivideYVenceras.PoliciaDyV.Ejercicio01;
public class Sector implements Comparable<Sector> {
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
	

	public Sector(Sector sector) {
		this.i = sector.i;
		this.j = sector.j;
		this.score = sector.score;
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

	@Override
	public boolean equals(Object o) {
		/** 
		if (this.getScore() == (Sector)o.getScore()) {
			return true;
		}
		*/
		return this.compareTo((Sector)o) == 0;
	}
	
	@Override
	public int compareTo(Sector o) {
		if (this.getScore() < o.getScore())
			return -1;
		if (this.getScore() > o.getScore())
			return 1;
		return 0;
	}
}
