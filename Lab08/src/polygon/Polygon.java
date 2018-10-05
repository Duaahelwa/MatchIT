package polygon;

import se.lth.cs.pt.window.SimpleWindow;

public class Polygon {
	/** Skapar en kvadrat som kan ha upp till 10 hörnpunkter. */
	private Point[] pol;
	private int pointers = 0;

	public Polygon() {
		this.pol = new Point[4];
	}

	/** Lägger till en ny hörnpunkt med koordinaterna x, y. */
	public void addVertex(int x, int y) {

		Point point = new Point(x, y);
		pol[pointers] = point;
		pointers++;

	}

	/** Ritar polygonen i fönstret w. */
	public void draw(SimpleWindow w) {

		w.moveTo((int) Math.round(pol[0].getX()), (int) Math.round(pol[0].getY()));
		
		for (int i = 1; i < pol.length; i++) {

			w.lineTo((int) Math.round(pol[i].getX()), (int) Math.round(pol[i].getY()));
		}

		w.lineTo((int) Math.round(pol[0].getX()), (int) Math.round(pol[0].getY()));

	}

}
