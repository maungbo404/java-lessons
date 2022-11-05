package day12Assignment4;

public class Circle implements Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (Math.pow(radius, 2));
	}

	@Override
	public double volume() {
		return 0;
	}

}