import java.util.Random;

import se.lth.cs.pt.window.SimpleWindow;



public class TurtleSix {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "TwoTurtelsVandring");
		Random rand = new Random();
		double distance = 50;// distance between the turtels
		int x1, y1, x2, y2;// cooridantor of both turtels

		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);

		t1.penDown();
		t2.penDown();

		while (distance >= 50) {

			t1.forward(rand.nextInt(9) + 1);
			t1.left(rand.nextInt(361) - 180);

			t2.forward(rand.nextInt(9) + 1);
			t2.left(rand.nextInt(361) - 180);

			x1 = t1.getX();
			y1 = t1.getY();

			x2 = t2.getX();
			y2 = t2.getY();

			distance = Math.sqrt(Math.abs((x1 - x2) * (x1 - x2)) + Math.abs((y1 - y2) * (y1 - y2)));
			System.out.println("The distance between the two turtels is: " + distance);

		}
	}

}
