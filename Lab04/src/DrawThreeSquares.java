import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
Square sq1 = null;
		//		Square sq1 = new Square(250, 250, 100);
		sq1.draw(w);
		Square sq2 = new Square(300, 300, 100);
		sq2.draw(w);
		Square sq3 = new Square(350, 350, 100);
		sq3.draw(w);
	}
}
