package g30126.bacs.andrei.l3.e6;

public class Main {

	public static void main(String[] args)
	{
		MyPoint  point=new MyPoint(2,5);
		System.out.println(point.toString());
		point.point0();
		System.out.println(point.toString());
		point.setXY(5, 10);
		MyPoint point2=new MyPoint(3,5);
		System.out.println(point.toString());
		System.out.println(point.distance(point2));
	}
}
