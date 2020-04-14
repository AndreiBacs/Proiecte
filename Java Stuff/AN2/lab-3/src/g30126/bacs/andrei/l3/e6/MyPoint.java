package g30126.bacs.andrei.l3.e6;

public class MyPoint {

	private int x,y;
	MyPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void point0()
	{
		this.x=0;
		this.y=0;
	}
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public String toString()
	{
		return "("+x+", "+y+")";
	}
	public double distance(MyPoint a)
	{
		return Math.sqrt((x-a.getx())*(x-a.getx())+(y-a.gety())*(y-a.gety()));
		
	}
}

