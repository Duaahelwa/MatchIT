import java.util.Scanner;

import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;

public class MazeTurtle {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Maze");
		Scanner scan = new Scanner(System.in);

		System.out.println("PLease enter the number of the walls of maze");
		int num = scan.nextInt();
		Maze maze = new Maze(num);
		maze.draw(w);

		Turtle turtle = new Turtle(w, 300, 300);
		MazeWalker mWalker = new MazeWalker(turtle);
		mWalker.walk(maze);

		scan.close();

	}

}
