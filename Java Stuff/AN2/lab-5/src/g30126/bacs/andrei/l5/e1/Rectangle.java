package g30126.bacs.andrei.l5.e1;

public class Rectangle extends Shape {
	protected double width,length;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double width,double length) {
		this.length=length;
		this.width=width;
	}
	public  Rectangle(double width,double length,String color,Boolean filled) {
		super(color,filled);
		this.length=length;
		this.width=width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}
	@Override
	public String toString() {
		  return "Rectangle{" +

	               "color='" + color + '\'' +

	               ", filled=" + filled +

	               ", length=" + length +
	               
	               ", width=" + width+

	               '}';

	   }
	}
	
