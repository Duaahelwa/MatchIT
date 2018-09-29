
public class Mole {

	private Graphics g = new Graphics(100, 80, 10);

	public static void main(String[] args) {
		Mole m = new Mole();
		m.drawWorld();
		m.dig();
	}

	public void drawWorld() {

		int gHeight = g.getHeight();
		int width = g.getWidth();

		g.rectangle(0, gHeight / 2, width, gHeight / 2, Colors.SOIL);
		g.rectangle(0, gHeight / 4, width, gHeight / 4, Colors.GRASS);
		g.rectangle(0, 0, width, gHeight / 4, Colors.SKY);

	}

	public void dig() {
		int x = g.getWidth() / 2; // För att börja på mitten
		int y = g.getHeight() / 2;

		while (true) {
			g.block(x, y, Colors.MOLE);
			char key = g.waitForKey();

			if (y < g.getHeight() / 2) {
				g.block(x, y, Colors.GRASS);
			} else {
				g.block(x, y, Colors.TUNNEL);
			}
			if (key == 'w') {
				y = (y <= g.getHeight() / 4) ? y + 1 : y - 1;

			} else if (key == 'a') {
				x = (x <= 0) ? x + 1 : x - 1;

			} else if (key == 's') {
				y = (y >=g.getHeight() -1) ? y - 1 : y+1;

			} else if (key == 'd') {
				x = (x >= g.getWidth() -1) ? x - 1 : x+1 ;
			}


		}

	}
}
