import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class AnimatedSquare {

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

		Square sq = new Square(oldX, oldY, 100);
		for (int i = 0; i < squares; i++) {
//			while (sq.getSide() > 0) {
			sq.move(xDist, yDist);
			sq.draw(w);
			SimpleWindow.delay(30);
			sq.erase(w);
//			sq.setSide(sq.getSide() - 10);

//			}
		}
	}
}
