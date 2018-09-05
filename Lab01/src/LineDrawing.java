import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.moveTo(0, 0);
		while (true) {
			/** Wait until user clicks with mouse**/
			w.waitForMouseClick();
			
			/*Get the x coordinator*/
			int x = w.getMouseX();
			
			/*Get the y coordinator*/
			int y = w.getMouseY();
			w.lineTo(x, y);
		}
	}
}