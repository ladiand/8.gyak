package harmadik;

import java.awt.Color;

import masik.Pont;
import sajat.ISzinezheto;

public class Szinespont extends Pont implements ISzinezheto {

	private Color szin;
	
	public Szinespont (int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}
	
	@Override
	public Color getSzin() {
		return szin;
	}
	
	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}

	@Override
	public String toString() {
		return "Szinespont [getSzin()=" + getSzin() + ", toString()="
				+ super.toString() + "]";
	}

}
