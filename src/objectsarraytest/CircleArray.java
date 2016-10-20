package objectsarraytest;

import java.awt.Color;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class CircleArray implements Iterable<Circle> {
	private Circle [] circles;

	public CircleArray(int n) {
		circles = new Circle [n];
		for (int i = 0; i < n; i++) {
			Random num = new Random();
			Circle temp = new Circle(num.nextDouble() * 500,
					num.nextDouble() * 300, num.nextDouble() * 60, 
					new Color((int) (num.nextDouble() * 0xFFFFFF)),
					EnglishNumberToWords.convert(i + 1));
			circles[i] = temp;
		}
	}

	public void printTabNames() {
		System.out.println("Circle\t\t\tx\t y\t  r\t\n");

		for (Circle c : circles) {
			System.out.printf("%-20s%6.0f%9.0f%9.0f\n", c.getName(), c.getX(),
					c.getY(), c.getR());
		}
	}

	@Override
	public Iterator<Circle> iterator() {

		return Arrays.asList(circles).iterator();

	}

}
