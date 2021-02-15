package test04;

public class Circle {
	private double radius;
	
	public Circle() {}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}
}
