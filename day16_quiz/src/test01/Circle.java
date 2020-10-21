package test01;

public class Circle {
	public final double PI = Math.PI;
	private int radius;
	
	public Circle() {
		this.setRadius(radius);
	}
	public Circle(int radius) {
		this.setRadius(radius);
	}
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("반지름"+radius+"cm인 원을 그립니다.");
	}

}
