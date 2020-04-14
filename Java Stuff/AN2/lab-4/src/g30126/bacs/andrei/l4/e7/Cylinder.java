package g30126.bacs.andrei.l4.e7;

import g30126.bacs.andrei.l4.e3.Circle;

public class Cylinder extends Circle{
	private double height=1.0;
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(double radius)
	{
		super(radius);
		
	}
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public double getArea() {
		//super.getArea();
		return Math.PI*super.getRadius()*super.getRadius();
	}
	public double getVolume() {
		return getHeight()*getArea();
	}
	
}
