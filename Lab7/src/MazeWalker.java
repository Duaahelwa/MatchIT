import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeWalker {
	private Turtle turtle;

	public MazeWalker(Turtle turtle) {
		this.turtle = turtle;

	}

	public void walk(Maze maze) {
		int steps = 0;
		int dirctionChangedCounter = 0;

		turtle.jumpTo(maze.getXEntry(), maze.getYEntry());
		turtle.penDown();
		while (!maze.atExit(turtle.getX(), turtle.getY())) {
			if (maze.wallAtLeft(90, turtle.getX(), turtle.getY())
					&& (!maze.wallInFront(90, turtle.getX(), turtle.getY()))) {
				turtle.forward(1);

			} else if (!maze.wallAtLeft(90, turtle.getX(), turtle.getY())
					&& (maze.wallInFront(90, turtle.getX(), turtle.getY()))) {
				turtle.left(90);// go left
				turtle.forward(1);
				dirctionChangedCounter++;

			} else if (maze.wallAtLeft(90, turtle.getX(), turtle.getY())
					&& (maze.wallInFront(90, turtle.getX(), turtle.getY()))) {
				turtle.left(-90);// go right
				turtle.forward(1);
				dirctionChangedCounter++;

			} else {
				turtle.left(90);
				turtle.forward(1);
				dirctionChangedCounter++;

			}
			steps++;
		}
		System.out.println("The total steps that the turtle has made is : " + steps + "  steps");
		System.out.println("The turtle had changed its direction for : " + dirctionChangedCounter + " times");
	}

}
