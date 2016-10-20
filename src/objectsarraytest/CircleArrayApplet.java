package objectsarraytest;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class CircleArrayApplet extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5897669125207435314L;

	private int numberOfCircles;
	private String parser;
	private CircleArray arr;

	public void init() {
		this.setSize(600, 300);
		parser = JOptionPane
				.showInputDialog("How many circles do you want to see [1 - 40]?");
		numberOfCircles = Integer.parseInt(parser);
		if (numberOfCircles > 40)
			numberOfCircles = 40;
		arr = new CircleArray(numberOfCircles);
		arr.printTabNames();

	}

	public void paint(Graphics g) {
		for (Circle c : arr) {
			g.setColor(c.getColor());
			g.fillOval((int) c.getX(), (int) c.getY(), (int) c.getR(),
					(int) c.getR());
			g.drawString(c.getName(), (int) c.getX(),
					(int) (c.getY() + c.getR() + 10));

		}

	}

}
