import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeWalker {
	private Turtle turtle;
	private SimpleWindow w;
	private Maze maze;

	public MazeWalker(Turtle turtle) {
		this.turtle = turtle;
		w = new SimpleWindow(600, 600, "TurtleDrawSquare");
//		turtle = new Turtle(w, maze.getXEntry(), maze.getYEntry());
	}

	public void walk(Maze maze) {
		turtle.jumpTo(maze.getXEntry(), maze.getYEntry());
		
		turtle.turnNorth();

		while (!maze.atExit(turtle.getX(), turtle.getY())) {
			int x = turtle.getX();
			int y = turtle.getY();

			if (maze.wallAtLeft(90, x, y)) {
				turtle.forward(1);
				SimpleWindow.delay(20);
			} else if (maze.wallInFront(180, x, y)) {
				turtle.left(90);
			}
		}

	}

}
