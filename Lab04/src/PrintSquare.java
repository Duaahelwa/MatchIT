import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class PrintSquare {

	public static void main(String[] args) {

		SimpleWindow w = new SimpleWindow(600, 600, "PrintSquares");

		w.waitForMouseClick();
		int oldX = w.getMouseX();
		int oldY = w.getMouseY();

		w.waitForMouseClick();
		int newX = w.getMouseX();
		int newY = w.getMouseY();

		int squares = 10;
		int xDist = (newX - oldX) / squares;
		int yDist = (newY - oldY) / squares;

		for (int i = 0; i <= squares; i++) {
			Square sq = new Square(oldX, oldY, 100);
			sq.draw(w);
			oldX = oldX + xDist;
			oldY = oldY + yDist;

		}
	}
}
