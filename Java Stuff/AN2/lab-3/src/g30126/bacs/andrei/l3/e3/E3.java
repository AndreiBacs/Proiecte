package g30126.bacs.andrei.l3.e3;
import becker.robots.*;
public class E3 {
	public static void main(String[] args)
	{
		City cluj=new City();
		Robot gigi=new Robot(cluj,1,1,Direction.NORTH);
		gigi.move();
		gigi.move();
		gigi.move();
		gigi.move();
		gigi.move();
		gigi.turnLeft();
		gigi.turnLeft();
		gigi.move();
		gigi.move();
		gigi.move();
		gigi.move();
		gigi.move();
	}

}
