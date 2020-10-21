package test01;

public class ShapeMaker {
	public static void main(String[] args) {
		Circle c[] = new Circle[3];
		RectAngle r[]= new RectAngle[2];
		
		c[0].setRadius(20);
		c[1].setRadius(40);
		c[2].setRadius(50);
		
		for (int i=0; i<3; i++) {
			c[i].draw();
		}
		for (int i=0; i<2; i++) {
			r[i].draw();
		}
		
	}

}
