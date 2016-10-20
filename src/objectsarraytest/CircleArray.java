package objectsarraytest;

import java.awt.Color;
import java.util.Iterator;
import java.util.Random;

public class CircleArray implements Iterable<Circle> {
	private Circle[] circles;
	private int currentSize;

	public CircleArray(int n) {
		circles = new Circle[n];
		currentSize = n;
		for (int i = 0; i < n; i++) {
			Random num = new Random();
			Circle temp = new Circle(num.nextDouble() * 500,
					num.nextDouble() * 300, num.nextDouble() * 60, new Color(
							(int) (num.nextDouble() * 0xFFFFFF)),
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
		Iterator<Circle> it = new Iterator<Circle>() {

			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < currentSize
						&& circles[currentIndex] != null;
			}

			@Override
			public Circle next() {
				return circles[currentIndex++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException(
						"Called remove which is not supported.");

			}

		};

		return it;

	}

}
