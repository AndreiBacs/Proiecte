package g30126.bacs.andrei.l4.e8;

public class Square extends Rectangle{
	public Square() {
		// TODO Auto-generated constructor stub
	}
	Square(double side)
	{
		super(side,side);
	}
	Square(double side,String color,Boolean filled)
	{
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
	public String toString() {
		super.toString();
		return "A Square with side="+getSide()+",which is a subclass of "+ super.toString();
	}
}
