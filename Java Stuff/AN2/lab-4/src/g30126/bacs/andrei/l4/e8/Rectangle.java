package g30126.bacs.andrei.l4.e8;

public class Rectangle extends Shape{

	public double width,length;
	public Rectangle() {
		this.width=1.0;
		this.length=1.0;
	}
	public Rectangle(double width,double length) {
		this.length=length;
		this.width=width;
	}
	public Rectangle(double width,double length,String color,Boolean filled) {
		super(color,filled);
		this.length=length;
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return "A Rectangle with width="+getWidth()+" and length="+getLength()+",which is a subclass of "+super.toString();
		
	}
	
}
