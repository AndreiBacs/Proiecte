package g30126.bacs.andrei.l4.e3;

public class Circle {
	private double radius;
	public String color;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius=1.0;
		color="red";
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
		
	}
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	

}
