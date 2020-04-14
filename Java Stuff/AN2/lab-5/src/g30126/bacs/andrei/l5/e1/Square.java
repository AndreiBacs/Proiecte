package g30126.bacs.andrei.l5.e1;

public class Square extends Rectangle{
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public  Square(double side) {
		super(side,side);
	}
	public  Square(double side,String color,Boolean filled) {
		super(side,side,color,filled);
	}
	public double getSide() {
		return getWidth();
	}
	public void setSide(double side) {
		setWidth(side);
	}
	public void setWidth(double side) {
		setWidth(side);
	}
	public void setLength(double side) {
		setLength(side);
	}
	@Override
	public String toString() {
		 return "Square{" +

	               "color='" + color + '\'' +

	               ", filled=" + filled +

	               ", side=" + length +

	               '}';

	   }
	}


