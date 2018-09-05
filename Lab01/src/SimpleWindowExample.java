import java.awt.Color;

import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "square");
		w.setLineWidth(3);
		w.setLineColor(Color.BLUE);
		Square sq = new Square(20, 20, 40);
		sq.draw(w);
		System.out.println(sq.getArea());
		w.writeText("hi");

	}
}