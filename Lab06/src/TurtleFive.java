import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;

public class TurtleFive {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "TurtleDrawRandomSteg");
		Turtle t = new Turtle(w, 300, 300);
		Random rand = new Random();
		t.penDown();
		for (int i = 1; i <= 1000; i++) {
			t.forward(rand.nextInt(9) + 1);
			t.left(rand.nextInt(361) - 180);
			System.out.println( rand.nextInt(361) - 180);
		}

	}
}
