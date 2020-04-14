package g30126.bacs.andrei.l4.e8;

public class Circle extends Shape{
	private double radius=1.0;
	public Circle() {
		// TODO Auto-generated constructor stub
		this.radius=1.0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color,Boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		return "A Circle with radius "+getRadius()+", which is a subclass of "+super.toString();
	}
	
	
}
